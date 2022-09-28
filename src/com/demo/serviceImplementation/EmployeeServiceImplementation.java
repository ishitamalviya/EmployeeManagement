package com.demo.serviceImplementation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.demo.EmployeeModel.Employee;
import com.demo.service.EmployeeServiceLayer;

public class EmployeeServiceImplementation implements EmployeeServiceLayer {
	
	List<Employee> employees = new ArrayList<Employee>();
	

	@Override
	public String insertEmployee(Employee emp) {
		// TODO Auto-generated method stub
		this.employees.add(emp);
		
		
		return "Employees data inserted sucessfully !!!";
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employees;
	}
	
	
	
	

}
