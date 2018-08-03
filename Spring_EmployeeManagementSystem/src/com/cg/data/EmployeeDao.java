package com.cg.data;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {

	List<Employee> employees=new ArrayList<Employee>();
	
	public void addEmployee(Employee emp) {
		
		employees.add(emp);
	}
	public List<Employee> viewAllEmployees()
	{
		return employees;
	}
	public Employee getEmployeeById(int id)
	{
		for(Employee employee1 : employees)
		{
			if(employee1.getId()==id)
			{
				return employee1;
			}
		}
		return null;
	}
	public List<Employee> deleteEmployee(int id)
	{    Employee employee2=null;
		for(Employee employee1 : employees)
		{
			if(employee1.getId()==id)
			{
				employee2=employee1;
			}
		}
		employees.remove(employee2);
		return employees;
	}
}
