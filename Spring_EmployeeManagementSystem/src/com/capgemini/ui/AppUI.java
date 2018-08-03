package com.capgemini.ui;

import com.cg.controller.AppController;
import com.cg.data.Employee;

public class AppUI {
    private AppController control;
	public  void acceptData()
	{
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		
		e1.setName("Raj");
		e2.setName("Rajan");
		e3.setName("Shyam");
		
		e1.setId(1);
		e2.setId(2);
		e3.setId(3);
		
		e1.setSalary(100000);
		e2.setSalary(200000);
		e3.setSalary(300000);
		
		control.addEmployee(e1);
		control.addEmployee(e2);
		control.addEmployee(e3);
	
	}
	
	public void display()
	{
		System.out.println(control.viewAllEmployee());
		
	}
}
