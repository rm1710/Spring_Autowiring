package com.spring.autowire;

import org.springframework.context.*;
import org.springframework.context.support.*;

public class App {
	public static void main(String[] a) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/autowire/config.xml");
		
		Student st=context.getBean("st",Student.class);
		
		System.out.println(st);
	}
}
