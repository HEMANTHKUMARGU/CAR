package com.task;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Javaconfig.class);
		Lamborghini ben = (Lamborghini)context.getBean("Lamborghini");
		ben.cardetails();

	}

}
