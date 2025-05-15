package com.gvp.orm.Spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp3 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Icar1 bean = (Icar1)context1.getBean("Nano1");
		System.out.println(bean.getCarDetails());
		System.out.println(bean.getEngineDetails());
		context1.close();
		

	}

}
