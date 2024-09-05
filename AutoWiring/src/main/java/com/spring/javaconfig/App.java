package com.spring.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[]a) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(config.class);
		
		Emp em= context.getBean("emp",Emp.class);
		System.out.println(em);
	}
}
