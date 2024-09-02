package com.spring.stereotype;

import org.springframework.context.*;
import org.springframework.context.support.*;

public class App {
	public static void main(String a[]) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/stereotype/config.xml");
		
		Emp em=context.getBean("employee",Emp.class);
		Emp em2=context.getBean("employee",Emp.class);
		System.out.println(em.hashCode());
		System.out.println(em2.hashCode());
		
		
		
	}
}
