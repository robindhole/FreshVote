package com.codenetworkz.repositories;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

class userTest {

	
	@Autowired
	private PasswordEncoder getPasswordEncoder; 
	
	@Test
	void PasswprdGaneteTest() {
		
		String pass="redhat";
		
		
		System.out.println(getPasswordEncoder.encode(pass));
		
		
	}

}
