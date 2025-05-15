package com.gvp.orm.Spring;

import org.springframework.stereotype.Component;

@Component("Nano")
public class Nano implements Car {

	@Override
	public String getCarDetails() {
		// TODO Auto-generated method stub
		return "NANO";
	}

}
