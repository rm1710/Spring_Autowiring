package com.spring.Spel;

import org.springframework.context.*;
import org.springframework.context.support.*;
import org.springframework.expression.spel.standard.SpelExpressionParser;


public class Test {
	public static void main(String arg[]) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/Spel/config.xml");
		Student st=context.getBean("student",Student.class);
		System.out.println(st.checkStatus);
//		System.out.println(st.terinaryCheck);
		System.out.println(st.num);
		System.out.println(st.s);
		
		SpelExpressionParser parser=new SpelExpressionParser();
		
		org.springframework.expression.Expression ex=parser.parseExpression("'Hello world'");
		System.out.println(ex.getValue());
	}
}