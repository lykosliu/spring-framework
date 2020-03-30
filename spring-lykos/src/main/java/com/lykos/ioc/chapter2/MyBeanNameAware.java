package com.lykos.ioc.chapter2;

import org.springframework.beans.factory.BeanNameAware;

public class MyBeanNameAware implements BeanNameAware {
	@Override
	public void setBeanName(String name) {
		System.out.println(name);
	}
}
