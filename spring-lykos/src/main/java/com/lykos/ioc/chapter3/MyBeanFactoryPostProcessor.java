package com.lykos.ioc.chapter3;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		DefaultListableBeanFactory defaultListableBeanFactory = (DefaultListableBeanFactory)beanFactory;
		BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(ITransportation.class);
		GenericBeanDefinition genericBeanDefinition = (GenericBeanDefinition)beanDefinitionBuilder.getRawBeanDefinition();
		genericBeanDefinition.getPropertyValues().addPropertyValue("interfaceClass",ITransportation.class);
		genericBeanDefinition.setBeanClass(CustomerFactoryBean.class);
		defaultListableBeanFactory.registerBeanDefinition("transportationImpl",genericBeanDefinition);
		System.out.println("postProcessBeanFactory init");
	}
}
