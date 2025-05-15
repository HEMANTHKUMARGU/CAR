package com.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class BankDetails implements Bank {
	private Employee2 employee2;
	private Employee2 employee;
	
    
	public BankDetails(Employee2 employee2) {
		super();
		this.employee= employee2;
	}


	@Override
	public String bankDetails() {
		
		return "SBIbank";
	}
	public String getEmployeeHDetails()
	{
		return employee2.getEmployeeHDetails();
	}

}
