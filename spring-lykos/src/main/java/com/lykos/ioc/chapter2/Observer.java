package com.lykos.ioc.chapter2;

import lombok.Data;

import java.beans.ConstructorProperties;

public class Observer {
	//无参构造方法
	public Observer(){}
	//有参构造方法
	@ConstructorProperties({"name"})
	public Observer(String name){
		this.name = name;
	}
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
