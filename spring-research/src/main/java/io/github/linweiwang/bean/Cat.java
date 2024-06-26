package io.github.linweiwang.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;

public class Cat implements InitializingBean {

	public Cat() {
		System.out.println("Cat constructor");
	}

	private String name;

	@Value("${JAVA_HOME}")
	public void setName(String name) {
		System.out.println("Cat setName: " + name);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Cat InitializingBean afterPropertiesSet");
	}
}
