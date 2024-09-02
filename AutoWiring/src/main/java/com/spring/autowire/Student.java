package com.spring.autowire;

public class Student {
	private Address address;

	public Student(Address address) {
		super();
		this.address=address;
		System.out.println("constructor Injection");
	}
	
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
