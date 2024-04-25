package io.github.linweiwang.processor.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Constructor;

@Component
public class MySmartInstantiationAwareBeanPostProcessor implements SmartInstantiationAwareBeanPostProcessor {

	public MySmartInstantiationAwareBeanPostProcessor() {
		System.out.println("MySmartInstantiationAwareBeanPostProcessor constructor");
	}

	@Override
	public Class<?> predictBeanType(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("MySmartInstantiationAwareBeanPostProcessor predictBeanType");
		return SmartInstantiationAwareBeanPostProcessor.super.predictBeanType(beanClass, beanName);
	}

	@Override
	public Constructor<?>[] determineCandidateConstructors(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("MySmartInstantiationAwareBeanPostProcessor determineCandidateConstructors");
		return SmartInstantiationAwareBeanPostProcessor.super.determineCandidateConstructors(beanClass, beanName);
	}

	@Override
	public Object getEarlyBeanReference(Object bean, String beanName) throws BeansException {
		System.out.println("MySmartInstantiationAwareBeanPostProcessor.getEarlyBeanReference");
		return SmartInstantiationAwareBeanPostProcessor.super.getEarlyBeanReference(bean, beanName);
	}
}
