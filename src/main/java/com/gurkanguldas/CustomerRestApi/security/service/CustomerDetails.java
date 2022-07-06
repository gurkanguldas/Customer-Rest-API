package com.gurkanguldas.CustomerRestApi.security.service;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.gurkanguldas.CustomerRestApi.security.data.CustomerLogin;

public class CustomerDetails implements UserDetails 
{
	private static final long serialVersionUID = 8831175503083872249L;

	private CustomerLogin customer;

	public CustomerDetails(CustomerLogin customer) 
	{
		this.customer = customer;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() 
	{
		return new ArrayList<>();
	}

	@Override
	public String getPassword() 
	{
		return customer.getPassword();
	}

	@Override
	public String getUsername() 
	{
		return customer.getNickname();
	}

	@Override
	public boolean isAccountNonExpired() 
	{
		return true;
	}

	@Override
	public boolean isAccountNonLocked() 
	{
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() 
	{
		return true;
	}

	@Override
	public boolean isEnabled() 
	{
		return true;
	}

}
