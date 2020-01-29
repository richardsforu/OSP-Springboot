package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	private int empId;
	private String empName;
	
	@Autowired
	private Department dept;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void display() {

		System.out.println("Id: " + empId);
		System.out.println("Name: " + empName);
		System.out.println("Dept Id: "+dept.getDeptId());
		System.out.println("Dept Name: "+dept.getDeptName());
		
		
	}

}
