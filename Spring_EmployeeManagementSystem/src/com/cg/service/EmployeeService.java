package com.cg.service;

import java.util.List;

import com.cg.data.Employee;
import com.cg.data.EmployeeDao;

public class EmployeeService {

	private EmployeeDao employeeDao;
	public void addEmployee(Employee emp) {
		
		employeeDao.addEmployee(emp);
	}
	public List<Employee> viewAllEmployee() {
		
		return employeeDao.viewAllEmployees();
	}
	public void getEmployeeById(int id) {
		
		employeeDao.getEmployeeById(id);
	}
	public void deleteEmployee(int id)
	{
		employeeDao.deleteEmployee(id);
	}
	
}
