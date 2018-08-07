package com.cg.service;

import java.util.List;

import com.cg.data.Employee;
import com.cg.data.EmployeeDao;

//To set the value by referring to EmployeeDao class

public class EmployeeService {

	private EmployeeDao employeeDao;
	
	public void setEmployeeDao(EmployeeDao employeeDao)
	{
	    this.employeeDao=employeeDao;
	}
	public void addEmployee(Employee emp) {
		
		employeeDao.addEmployee(emp);
	}
	public List<Employee> viewAllEmployee() {
		
		return employeeDao.viewAllEmployees();
	}
	public Employee getEmployeeById(int id) {
		
		return employeeDao.getEmployeeById(id);
	}
	public void deleteEmployee(int id)
	{
		employeeDao.deleteEmployee(id);
	}
	
}
