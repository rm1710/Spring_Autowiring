package com.spring.autowire.annotation;

import org.springframework.context.*;
import org.springframework.context.support.*;

public class App {
	public static void main(String a[]) {
		ApplicationContext context =new ClassPathXmlApplicationContext("com/spring/autowire/annotation/config.xml");
		
		Student student = context.getBean("st", Student.class);
		System.out.println(student);
	}
}
