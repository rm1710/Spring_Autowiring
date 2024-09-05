package com.spring.javaconfig;

import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;


@Component
public class Emp {
	
	
	private Address address;
	
	

	public Emp(Address address) {
		super();
		this.address=address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	
}
