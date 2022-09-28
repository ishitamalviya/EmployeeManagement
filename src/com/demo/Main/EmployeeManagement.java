package com.demo.Main;

import java.util.List;
import java.util.Formatter;
import java.util.Scanner;

import com.demo.EmployeeModel.Employee;
//import com.demo.EmployeeModel.Employee;
import com.demo.service.EmployeeServiceLayer;
import com.demo.serviceImplementation.EmployeeServiceImplementation;


public class EmployeeManagement {
	
	public static void main(String[] args) {
		
		int cases = 1;
		boolean status = true;
		//changes made
		//again did change
		EmployeeServiceLayer employeeService = new EmployeeServiceImplementation();
		
		//Formatter fmt = new Formatter();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 to insert Employees data");
		System.out.println("Enter 2 to show Employees data");
		
		do {
		
			cases = sc.nextInt();
		
		switch(cases) {
		
		case 1:
			
			//EmployeeServiceLayer employeeService = new EmployeeServiceImplementation();
			
			Employee employee = new Employee();
			
			//Formatter fmt = new Formatter();
			employee.setEmpId(28);
			
			employee.setEmpFirstName1("Ishita");
			
			employee.setEmpLastName("Malviya");
			
			employee.setEmpEmailAddress11("IM@ford.com");
			
			employee.setSalary(5000000);
			
			String insertEmployee = employeeService.insertEmployee(employee);
			//System.out.println(insertEmployee);
			System.out.format("%7s %14s %7s %10s %25s", Employee.getEmpId() , Employee.getEmpFirstName() , Employee.getEmpLastName(), Employee.getEmpEmailAddress(),Employee.getEmpSalary());
			System.out.printf("%7s %14s %7s %10s %25s", "EmpID" , "EmpFirstName" , "EmpLastName" , "EmpEmailAddress" , "EmpSalary");
			//employeeService.insertEmployee(employee);
			
			
			break;
			
		case 2:
			//EmployeeServiceLayer employeeServices = new EmployeeServiceImplementation();
			
			List<Employee> allEmployees = employeeService.getAllEmployees();
			
			//System.out.println(allEmployees);
			break;
		
		}
		
		}
		while(status);
		sc.close();
	}

}
