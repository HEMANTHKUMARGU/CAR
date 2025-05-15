package com.task;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ExceptionFile.xml");
		People1 bean = (People1)context.getBean("People1");
		bean.charr();
		

	}

}
