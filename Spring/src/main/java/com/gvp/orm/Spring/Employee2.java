package com.gvp.orm.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Employee2")
public class Employee2 {
	private Employee employee;
	
    @Autowired
	public Employee2(@Qualifier Employee employee) {
		super();
		this.employee = employee;
	}
    
	

}
