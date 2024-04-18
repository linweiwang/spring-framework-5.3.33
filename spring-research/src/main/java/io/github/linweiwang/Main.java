package io.github.linweiwang;

import io.github.linweiwang.bean.Person;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		// ClassPathXmlApplicationContext
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		Person person = context.getBean(Person.class);
		System.out.println(person);
	}
}
