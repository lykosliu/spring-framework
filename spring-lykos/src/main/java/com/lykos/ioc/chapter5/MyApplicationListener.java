package com.lykos.ioc.chapter5;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationListener implements ApplicationListener<MyApplicationEvent> {
	@Override
	public void onApplicationEvent(MyApplicationEvent event) {
		System.out.println(event.getClass());
	}
}