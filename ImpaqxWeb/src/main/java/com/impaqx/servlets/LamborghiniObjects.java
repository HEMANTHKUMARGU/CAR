package com.impaqx.servlets;

public class LamborghiniObjects {

	public Icar Objects(String s) {
		if (s.equalsIgnoreCase("LamborghiniBaseCar")) {
			return new LamborghiniBaseCar();
		} else if (s.equalsIgnoreCase("LamborghiniTopVerent")) {
			return new LamborghiniTopVerent();
		} else if (s.equalsIgnoreCase("LamborghiniAutomatic")) {
			return new LamborghiniAutomatic();
		}
		return null;
	}

}
