package com.codenetworkz.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codenetworkz.domain.Authority;
import com.codenetworkz.domain.User;
import com.codenetworkz.repositories.UserRepository;
import com.codenetworkz.service.UserService;

@Controller
public class RegisterController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	
	@GetMapping("/register")
	public String register(ModelMap modelMap) {
		modelMap.put("user" ,new User());
		return "register";
	}
	
	@PostMapping("/register")
	public String register( User user ) {
	
	//to get raw password then encode the password and save in variable  	
	String encodePass=passwordEncoder.encode(user.getPassword());
	
	//to set the password in user variable 
	user.setPassword(encodePass);
	
	//to create authority object and set the authority 
	Authority authority=new Authority();
	authority.setAuthority("ROLE_USER");
	
	//to get user object than set ob authority object
	authority.setUser(user);
	
	//user get the authority object and add the authority object to user object 
	user.getAuthorities().add(authority);
	
	//send the user object to User Repository object to save the user and authority object on databases
	userService.save(user);
	//redirect the page on view	
	return "redirect:/register";
	}
	
	@GetMapping("/forgot-password")
	public String forgetpassword(ModelMap modelMap) {
		User user=new User();
		modelMap.addAttribute("user",user);
		return "forgot-password";
	}
	
	@PostMapping("/forgot-password")
	public String forgetpasswordRequest(@RequestParam String username) {
	//logic for user forgot password
		
		return "forgot-password";
	}
	
}
