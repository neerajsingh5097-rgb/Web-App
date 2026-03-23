package com.spring.mvc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.mvc.model.Employee;

@Repository
public class EmployeeDao {
	
	@Autowired
    private final HibernateTemplate hibernateTemplate;

    public EmployeeDao(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    
    public void saveEmployee(Employee emp) {
		System.out.println("EmployeeDao.saveEmployee()");
		hibernateTemplate.save(emp);
	}


	public List<Employee> getAllEmployees() {
		return hibernateTemplate.loadAll(Employee.class);
	}
	

}