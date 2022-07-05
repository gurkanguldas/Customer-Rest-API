package com.gurkanguldas.CustomerRestApi.security.jwt;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtTokenUtil implements Serializable
{
	private static final long serialVersionUID = -7660481219758234460L;

	//The period of validity.
	public static final long JWT_TOKEN_VALIDITY = 5 * 60 * 60;
	
	//Secret key.
	@Value("${jwt.secret}")
    private String secret;

	//Retrieve username from jwt token.
    public String getUsernameFromToken(String token) 
    {
        return getClaimFromToken(token, Claims::getSubject);
    }

    //Retrieve expiration date from jwt token.
    public Date getExpirationDateFromToken(String token) 
    {
        return getClaimFromToken(token, Claims::getExpiration);
    }

    public <T> T getClaimFromToken(String token, Function<Claims, T> claimsResolver) 
    {
        final Claims claims = getAllClaimsFromToken(token);
        return claimsResolver.apply(claims);
    }
    
    //For retrieveing any information from token we will need the secret key.
    private Claims getAllClaimsFromToken(String token) 
    {
        return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
    }

    //Check if the token has expired.
    private Boolean isTokenExpired(String token) 
	{
        return getExpirationDateFromToken(token).before(new Date());
    }

    //Generate token for user.
    public String generateToken(UserDetails userDetails) 
    {
        Map<String, Object> claims = new HashMap<>();
        return doGenerateToken(claims, userDetails.getUsername());
    }
    
    //when creating the token
    //1. Token validity period is determined.
    //2. The token is signed using the HS256 algorithm and the secret key.
    private String doGenerateToken(Map<String, Object> claims, String subject) 
    {
        return Jwts.builder().setClaims(claims).setSubject(subject).setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + JWT_TOKEN_VALIDITY * 1000))
                .signWith(SignatureAlgorithm.HS256, secret).compact();
    }

   //Validate token.
    public Boolean validateToken(String token, UserDetails userDetails) 
    {
        final String username = getUsernameFromToken(token);
        return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
    }
}
