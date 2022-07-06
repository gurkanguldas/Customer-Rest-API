package com.gurkanguldas.CustomerRestApi.security.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gurkanguldas.CustomerRestApi.security.data.CustomerLogin;
import com.gurkanguldas.CustomerRestApi.security.jwt.JwtTokenUtil;
import com.gurkanguldas.CustomerRestApi.security.service.CustomerDetailsService;

@CrossOrigin
@RestController
@RequestMapping("/customer/login")
public class CustomerSecurityRestController implements ICustomerSecurityRestController 
{
	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtTokenUtil jwtTokenUtil;

	@Autowired
	private CustomerDetailsService userDetailsService;

	@Override
	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public ResponseEntity<?> createAuthenticationToken(@RequestBody CustomerLogin customer) throws Exception 
	{
		authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(customer.getNickname(), customer.getPassword()));

		UserDetails userDetails = userDetailsService.loadUserByUsername(customer.getNickname());

		customer.setToken(jwtTokenUtil.generateToken(userDetails));

		return ResponseEntity.ok().body(customer);
	}

}
