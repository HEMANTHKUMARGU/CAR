package com.gvp.orm.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("Audi")
public class Audi implements Icar1 {

	
	private Engine engine;
	private String color;
	private int price;

	@Override
	public String getCarDetails() {
		// TODO Auto-generated method stub
		return "Audi";
	}

	@Override
	public String getEngineDetails() {
		// TODO Auto-generated method stub
		return engine.getEngineDetails();
	}

	public Engine getengine() {
		return engine;
	}

	@Autowired
	public void setengine( Engine engine) {
		this.engine = engine;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
    
	void myStartup() {
		System.out.println("Bean created");
	}

	void myClosing() {
		System.out.println("Bean Destroyed");
	}

}
