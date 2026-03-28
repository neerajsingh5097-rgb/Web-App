package com.spring.mvc.model;


public class Employee {
	
	private int id;
	
	private String username,department,address;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id,String username, String department, String address) {
		super();
		this.id = id;
		this.username = username;
		this.department = department;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", username=" + username + ", department=" + department + ", address=" + address
				+ "]";
	}

}