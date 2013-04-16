package com.spring.standalone.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.standalone.model.Person;

public class SpringApplicationContextExample {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Person person = (Person) context.getBean("person");
		
		System.out.println(person.getAge());
	}

}