package com.task;

import org.springframework.beans.factory.annotation.Autowired;

public class People1 implements People{
	private People2 people2;
	
    
	public People1(People2 people2) {
		super();
		this.people2 = people2;
	}


	@Override
	public void charr() {
		System.out.println("inside the people1");
		
	}

}
