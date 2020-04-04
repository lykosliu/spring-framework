package com.lykos.ioc.chapter2;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.Lifecycle;
import org.springframework.context.LifecycleProcessor;
import org.springframework.context.SmartLifecycle;

public class LifecycleBeanB implements SmartLifecycle, BeanNameAware {
	private String name;
	public LifecycleBeanB(){
//		System.out.println("construct LifecycleBeanB");
	}
	public void init(){
//		System.out.println("init");
	}
	public void destroy(){
//		System.out.println("destory");
	}

	@Override
	public void start() {
		System.out.println("LifecycleBeanB start");
	}

	@Override
	public void stop() {
		System.out.println("LifecycleBeanB stop");
	}

	@Override
	public boolean isRunning() {
		return false;
	}

	@Override
	public void setBeanName(String name) {
		System.out.println(name);
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
