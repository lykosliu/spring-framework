package com.lykos.ioc.chapter2;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;

public class MyInitializingBean implements InitializingBean {
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("所有属性设置完成！");
	}
}
