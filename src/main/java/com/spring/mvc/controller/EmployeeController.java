package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.mvc.model.Employee;

@Controller
public class EmployeeController {
	
	
	@GetMapping("/")
	@ResponseBody
	public String getData()
	{
		System.out.println("EmployeeController.getData()");
		
		return "Hello This is my first RestApi";
	}
	
	
	@GetMapping("/getEmp")
	@ResponseBody
	public Employee getDummyObj()
	{
		System.out.println("EmployeeController.getDummyObj()");
		Employee e = new Employee(1,"Dummy", "CS","NOIDA");
		
		return e;
	}
	
	
	
}