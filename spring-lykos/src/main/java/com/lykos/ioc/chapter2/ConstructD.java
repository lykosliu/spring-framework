package com.lykos.ioc.chapter2;

import java.beans.ConstructorProperties;

public class ConstructD {
	private int age;
	private String name;

	//此处需要ConstructorProperties注释
	@ConstructorProperties({"age", "name"})
	public ConstructD(int age,String name){
		System.out.println("init ConstructD");
		this.age = age;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
