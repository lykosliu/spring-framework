package com.lykos.ioc.pojo;

import lombok.Data;
import org.springframework.beans.factory.InitializingBean;

@Data
public class Person implements InitializingBean {
	public Person(){
		System.out.println("person init");
	}
	private String name;
	private int age;
	private String sex;
	public void init(){
		System.out.println("exec init method");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("exec afterPropertiesSet method");
	}
}
