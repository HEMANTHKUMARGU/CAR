package com.gvp.orm.Spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp4 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Audi ben = (Audi)context.getBean("Audi");
		System.out.println(ben.getCarDetails());
		System.out.println(ben.getEngineDetails());
		System.out.println(ben.getColor());
		System.out.println(ben.getPrice());
		
		context.close();

	}

}
