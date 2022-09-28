package com.demo.EmployeeModel;

public class Employee {
	//properties
	private static int empId;
    private static String empFirstName;
    private static String empLastName;
    private static String empEmailAddress;
    private static double empSalary;
    
    @Override
	public String toString() {
		return "Employee [empId=" + empId + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName
				+ ", empEmailAddress=" + empEmailAddress + ", empSalary=" + empSalary + "]";
	}
    //constructor 
    public Employee() {
    	
    	super();
    }
    
	public Employee(int empId, String empFirstName, String empLastName, String empEmailAddress, int empSalary) {
		super();
		this.empId = empId;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.empEmailAddress = empEmailAddress;
		this.empSalary = empSalary;
	}

	
	//getter setter
	
	public static int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public static String getEmpFirstName() {
		return empFirstName;
	}

	public void setEmpFirstName1(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	public static String getEmpLastName() {
		return empLastName;
	}

	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}

	public static String getEmpEmailAddress() {
		return empEmailAddress;
	}

	public void setEmpEmailAddress11(String empEmailAddress) {
		this.empEmailAddress = empEmailAddress;
	}

	public static double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary1(int empSalary) {
		this.empSalary = empSalary;
	}
	public void setSalary(int i) {
		// TODO Auto-generated method stub
		
	}
	public void add(Employee employee) {
		// TODO Auto-generated method stub
		
	}
	

	//@Override
	//public String toString() {
		///return "Employee [empId=" + empId + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName
				//+ ", empEmailAddress=" + empEmailAddress + ", empSalary=" + empSalary + "]";
	}

	
	
    

//}
