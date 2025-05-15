package com.gvp.orm.Spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp8 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationApplicationContext.xml");
		Icar1 bean = context.getBean("Audi", Icar1.class);
		System.out.println(bean.getCarDetails());
		System.out.println(bean.getEngineDetails());
		context.close();


	}

}
