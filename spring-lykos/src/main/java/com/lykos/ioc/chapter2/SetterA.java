package com.lykos.ioc.chapter2;

public class SetterA {
	private String age;
	private String name;
	public SetterA(){
		System.out.println("init SetterA");
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public String getName() {
		return name;
	}
}
