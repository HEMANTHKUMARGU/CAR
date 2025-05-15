package com.task;

import org.springframework.beans.factory.annotation.Autowired;

public class People2 implements People {
	private People1 people1;
	
  
	public People2(People1 people1) {
		super();
		this.people1 = people1;
	}


	@Override
	public void charr() {
		System.out.println("inside the people2");
		
	}

}
