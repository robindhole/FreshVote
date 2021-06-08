package com.codenetworkz.security;

import java.util.Set;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.codenetworkz.domain.Authority;
import com.codenetworkz.domain.User;


public class CustomSecurityUser extends User implements UserDetails {

	
	private static final long serialVersionUID = -8629053071040867111L;
	
	public CustomSecurityUser(User user) {
		super.setUsername(user.getUsername());
		super.setId(user.getId());
		super.setName(user.getName());
		super.setPassword(user.getPassword());
		super.setAuthorities(user.getAuthorities());
	}
	
	

	public CustomSecurityUser() {
		super();
	}



	@Override
	public Set<Authority> getAuthorities() {
		return super.getAuthorities();
	}

	@Override
	public String getPassword() {
		return super.getPassword();
	}

	@Override
	public String getUsername() {
		return super.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
