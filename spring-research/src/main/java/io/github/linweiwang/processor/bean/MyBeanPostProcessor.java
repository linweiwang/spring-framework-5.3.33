package io.github.linweiwang.processor.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Bean 的后置增强处理器
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

	public MyBeanPostProcessor() {
		System.out.println("MyBeanPostProcessor constructor");
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("MyBeanPostProcessor postProcessBeforeInitialization");
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("MyBeanPostProcessor postProcessAfterInitialization");
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
}
