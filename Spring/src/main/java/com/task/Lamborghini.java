package com.task;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component("Lamborghini")
public class Lamborghini implements Cars {
	private Farrari farrari;
//	Lamborghini(){
//		
//	}

	public Lamborghini(Farrari farrari) {
		super();
		this.farrari = farrari;
	}

	@Override
	public void cardetails() {
		System.out.println("Lamborghini car engine is good");

	}

}
