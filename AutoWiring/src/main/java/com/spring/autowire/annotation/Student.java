package com.spring.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	
	@Autowired
//	@Qualifier("ad3")
	private Address address;

//	public Student(Address address) {
//		super();
//		this.address=address;
//		System.out.println("constructor Injection");
//	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("setter injection");
		this.address = address;
	}
	

	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}
	
}
