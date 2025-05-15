package com.gvp.orm.Spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp5 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Icar1 ben=(Icar1)context.getBean("Audi");
		System.out.println(ben);
		context.close();
		
		

	}

}
