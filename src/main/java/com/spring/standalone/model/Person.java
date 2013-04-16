package com.spring.standalone.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {

	@Autowired
	private Integer age;
	
	public Integer getAge() {
		return age;
	}
}
