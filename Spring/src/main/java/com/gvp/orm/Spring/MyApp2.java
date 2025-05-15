package com.gvp.orm.Spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp2 {

	public static void main(String[] args) {
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Car Cbmw = (Car)context.getBean("Nano");
		System.out.println(Cbmw.getCarDetails());
		context.close();

	}

}
