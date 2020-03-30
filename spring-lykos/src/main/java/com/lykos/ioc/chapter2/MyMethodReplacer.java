package com.lykos.ioc.chapter2;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class MyMethodReplacer implements MethodReplacer {
	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("do your thing");
		//不能执行method.invoke(obj,args)
		return null;
	}
}
