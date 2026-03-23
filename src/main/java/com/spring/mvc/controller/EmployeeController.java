//package com.spring.mvc.controller;
//
//
//import java.util.HashMap;
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import com.spring.mvc.model.Employee;
//import com.spring.mvc.service.EmployeeService;
//
//@Controller
//public class EmployeeController {
//	@Autowired
//	EmployeeService employeeService;
//	
//	static Map<Integer,Employee> map = null;
//	static int empId=0;
//
//	static {
//		map= new HashMap<>();
//		map.put(++empId,new Employee(empId, "Mukesh","IT","Noida"));
//		map.put(++empId,new Employee(empId, "Nitesh","IT","Noida"));
//		map.put(++empId,new Employee(empId, "Abhishek","IOT","Noida"));
//		map.put(++empId,new Employee(empId, "Nakul","AT","Noida"));
//		map.put(++empId,new Employee(empId, "Prakash","IT","Noida"));
//
//
//
//	}
//	
//	@GetMapping("/")
//	public String welcome()
//	{
//		System.out.println("UserController.welcome()");
//		return "index";
//	}
//	
//	@GetMapping("/sign-up")
//	public String signUpForm()
//	{
//		System.out.println("UserController.signUpForm()");
//		return "sign-up";
//	}
//	
//	@GetMapping("/signupUser")
//	public String postUser(@RequestParam(name =  "username") String username,@RequestParam(name="department")String department,@RequestParam(name="address")String address,Model model)
//	{
//		System.out.println("Username : "+username);
//		System.out.println("Department : "+department);
//		System.out.println("Address : "+address);
//		
//		model.addAttribute("username", username);
//		model.addAttribute("department", department);
//		model.addAttribute("address", address);
//		
//		return "success";
//	}
//	
//	
//	
//	@PostMapping("/createUser")
//	public String createUser(@ModelAttribute Employee employee,Model model)
//	{
//		System.out.println(employee);
//		employee.setId(++empId);
//		map.put(empId, employee);
//		model.addAttribute("employee",employee);
//		return "success";
//	}
//	
//
//	@GetMapping("/getEmpById/{id}")
//	public String getEmp(@PathVariable (name = "id") int id,Model model)
//	{
//
//		Employee e= map.get(id);
//		
//		model.addAttribute("employee", e);
//		
//		return "success";
//	}
//	
//
//}


package com.spring.mvc.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.mvc.model.Employee;
import com.spring.mvc.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;


	@GetMapping("/")
	public String welcome() {
		System.out.println("UserController.welcome()");
		return "index";
	}

	@GetMapping("/sign-up")
	public String signUpForm() {
		System.out.println("UserController.signUpForm()");
		return "sign-up";
	}

	@PostMapping("/createUser")
	public String createUser(@ModelAttribute Employee emp, Model model) {
		employeeService.saveEmployee(emp);
		return "success";
	}

	@GetMapping("/getEmpById/{id}")
	public String getEmp(@PathVariable(name = "id") int id, Model model) {
		
		
		return "success";
	}

	
	
	@GetMapping("/employees")
	public String listEmployees(Model model) {
		model.addAttribute("employees", employeeService.getAllEmployees());
		return "employeeList";
	}
}