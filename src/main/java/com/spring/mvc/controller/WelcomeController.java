package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping("/login")
	public String greeting() {
		System.out.println("WelcomeController.getting()");
		return "index";
	}
}
