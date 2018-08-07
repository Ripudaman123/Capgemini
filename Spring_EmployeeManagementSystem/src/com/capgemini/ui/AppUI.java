package com.capgemini.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.controller.AppController;
import com.cg.data.Employee;

//User-Interface of the Employee Management System
public class AppUI {
    private static AppController control;
    
    public void setController( AppController control)
    {
    	 this.control= control;
    }
	public static void acceptData()
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
		control= (AppController) context.getBean("control");
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
	
	public static void display()
	{
		System.out.println(control.viewAllEmployee());
		
		System.out.println(control.getEmployeeById(2));
		
		control.deleteEmployee(1);
		System.out.println(control.viewAllEmployee());
	}
}
