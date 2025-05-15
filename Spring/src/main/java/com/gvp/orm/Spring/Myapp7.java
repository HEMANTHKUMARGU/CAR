package com.gvp.orm.Spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Myapp7 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationApplicationContext.xml");
		Icar1 bean = context.getBean("Bmw", Icar1.class);
		System.out.println(bean.getCarDetails());
		context.close();

	}

}
