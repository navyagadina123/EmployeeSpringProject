package com.cgg;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		AbstractApplicationContext cnt=new ClassPathXmlApplicationContext("spring.xml");
		
		Employee e=(Employee)cnt.getBean("employee1");
		System.out.println(e);

	}

}
