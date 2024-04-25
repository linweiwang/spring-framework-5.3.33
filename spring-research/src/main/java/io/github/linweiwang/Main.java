package io.github.linweiwang;

import io.github.linweiwang.bean.Cat;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		// ClassPathXmlApplicationContext
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		// 分析 Bean 生命周期
		Cat cat = context.getBean(Cat.class);
		System.out.println(cat);
	}
}
