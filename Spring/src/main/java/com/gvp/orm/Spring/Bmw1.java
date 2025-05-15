package com.gvp.orm.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Bmw1")
public class Bmw1 implements Icar1 {

	private Engine engine;

	@Autowired
	public Bmw1(@Qualifier("jetengine") Engine engine) {
		super();
		this.engine = engine;
	}

	@Override
	public String getCarDetails() {
		// TODO Auto-generated method stub
		return "BMW1";
	}

	@Override
	public String getEngineDetails() {
		// TODO Auto-generated method stub
		return engine.getEngineDetails();
	}

}
