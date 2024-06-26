package io.github.linweiwang.processor.bean;

import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

@Component
public class MyMergedBeanDefinitionPostProcessor implements MergedBeanDefinitionPostProcessor {

	public MyMergedBeanDefinitionPostProcessor() {
		System.out.println("MyMergedBeanDefinitionPostProcessor constructor");
	}

	@Override
	public void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName) {
		System.out.println("MyMergedBeanDefinitionPostProcessor#postProcessMergedBeanDefinition");
	}

	@Override
	public void resetBeanDefinition(String beanName) {
		System.out.println("MyMergedBeanDefinitionPostProcessor#resetBeanDefinition");
		MergedBeanDefinitionPostProcessor.super.resetBeanDefinition(beanName);
	}
}
