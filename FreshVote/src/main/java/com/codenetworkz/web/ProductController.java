package com.codenetworkz.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

	@GetMapping("/products")
	public String product() {
		return "dashboard/products";
	}
	
}
