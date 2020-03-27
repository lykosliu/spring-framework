package com.lykos;

import com.lykos.bean.One;
import com.lykos.config.AppConfig;
import com.lykos.service.HelloWorld;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@ComponentScan("com.lykos")
public class Rocket {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.register(Rocket.class);
		ac.refresh();
		ac.getBean(HelloWorld.class).say();


	}
}
