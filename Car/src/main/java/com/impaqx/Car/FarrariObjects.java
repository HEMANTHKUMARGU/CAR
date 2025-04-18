package com.impaqx.Car;

public class FarrariObjects {
	public Icar object(String s) {
		if (s.equalsIgnoreCase("FarrariBaseCar")) {
			return new FarrariBaseCar();
		} else if (s.equalsIgnoreCase("FarrariTopVerent")) {
			return new FarrariTopVerent();
		}
		return null;
	}

}
