package com.spring.javaconfig;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages="com.spring.javaconfig")
public class config {
	
	@Bean
	public Address add() {
		return new Address("ritesh");
	}
	
	@Bean(name={"emps"})
	public Emp getEmp() {
		return new Emp(add());
	}

}
