package com.task;

import org.springframework.stereotype.Component;

@Component("Employee2")
public class Employee2 implements EmployeeH{
	
	@Override
	public String getEmployeeHDetails() {
		return "NameHemanth";
		
	}

}
