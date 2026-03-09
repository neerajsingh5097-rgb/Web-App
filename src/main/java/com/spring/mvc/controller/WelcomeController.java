package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

//	@RequestMapping(value="/login")      // 	@RequestMapping("/login") ise aise bhi likh skte he becouse isme value automatic le leta he
	@GetMapping(value="/")
	public String greeting() {
		System.out.println("WelcomeController.getting()");
		return "index";
	}
	
	@GetMapping(value="/sign-up")
	public String creatUser() {
		System.out.println("welcomeControlar.greeting()");
		return "success";
	}
}
