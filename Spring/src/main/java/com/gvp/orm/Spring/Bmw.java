package com.gvp.orm.Spring;

import org.springframework.stereotype.Component;

@Component("Bmw")
public class Bmw implements Car {

	@Override
	public String getCarDetails() {
		// TODO Auto-generated method stub
		return "BMW";
	}

}
