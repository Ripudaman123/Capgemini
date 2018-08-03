package com.cg.controller;

import java.util.List;

import com.cg.data.Employee;
import com.cg.service.EmployeeService;

public class AppController {

	private EmployeeService employeeService;
	public void addEmployee(Employee emp) {
		
		 employeeService.addEmployee(emp);
	}
	public List<Employee> viewAllEmployee() {
		
		 return employeeService.viewAllEmployee();
	}
	public void getEmployeeById(int id) {
		
		 employeeService.getEmployeeById(id);
	}
	public void deleteEmployee(int id)
	{
		 employeeService.deleteEmployee(id);
	}
	
	
}
