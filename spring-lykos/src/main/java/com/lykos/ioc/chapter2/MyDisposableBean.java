package com.lykos.ioc.chapter2;

import org.springframework.beans.factory.DisposableBean;

public class MyDisposableBean implements DisposableBean {
	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean destroy");
	}
}
