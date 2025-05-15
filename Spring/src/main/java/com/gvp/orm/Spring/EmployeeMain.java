package com.gvp.orm.Spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Context.xml");
		Employee2 beane = (Employee2)context.getBean("Employee2");
		
		
		
		
		
		

	}

}
