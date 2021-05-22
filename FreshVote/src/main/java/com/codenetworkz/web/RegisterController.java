package com.codenetworkz.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codenetworkz.domain.User;

@Controller
public class RegisterController {

	
	
	@GetMapping("/register")
	public String register(ModelMap modelMap) {
		User user=new User();
		modelMap.addAttribute("user" , user);
		return "register";
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
