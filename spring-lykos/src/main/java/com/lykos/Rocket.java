package com.lykos;

import com.lykos.service.HelloWorld;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.lykos")
public class Rocket {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
		annotationConfigApplicationContext.register(Rocket.class);
		annotationConfigApplicationContext.refresh();
		annotationConfigApplicationContext.getBean(HelloWorld.class).say();
	}
}
