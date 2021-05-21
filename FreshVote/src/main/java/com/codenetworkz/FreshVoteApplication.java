package com.codenetworkz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
public class FreshVoteApplication {

	public static void main(String[] args) {
		SpringApplication.run(FreshVoteApplication.class, args);
	}

}
