package com.task;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Context.xml");
		BankDetails bean = (BankDetails) context.getBean("BankDetails");
		System.out.println(bean.getEmployeeHDetails());
		

		
	}

}
