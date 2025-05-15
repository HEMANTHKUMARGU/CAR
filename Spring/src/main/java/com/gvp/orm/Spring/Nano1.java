package com.gvp.orm.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Nano1")
public class Nano1 implements Icar1 {

	private Engine engine;

	@Autowired
	public Nano1(@Qualifier("rocketEngine") Engine engine) {
		super();
		this.engine = engine;
	}

	@Override
	public String getCarDetails() {
		// TODO Auto-generated method stub
		return "NANO1";
	}

	@Override
	public String getEngineDetails() {
		// TODO Auto-generated method stub
		return engine.getEngineDetails();
	}

}
