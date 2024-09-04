package com.spring.Spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.*;

@Component
public class Student {
	@Value("#{2+3}")
	public int sum;
	
	@Value("#{5-3}")
	public int sub;
	
	@Value("#{2}")
	public int mul;
	
	@Value("#{15/3}")
	public int div;
	
	@Value("#{1>1}")
	public  boolean equalvalid;
	
	public static String call() {
		return "method call";
	}
	
	@Value("#{1==1 && 2==2}")
	public boolean checkStatus;
	
	@Value("#{2>3? 'Yes':'NO'}")
	public String terinaryCheck;
	
	@Value("#{T(java.lang.Math).PI}")
	public int num;
	
	@Value("#{T(com.spring.Spel.Student).call()}")
	public String s;
	
	@Override
	public String toString() {
		return "Student [sum=" + sum + ", sub=" + sub + ", mul=" + mul + ", div=" + div + "]";
	}
}
