package com.lykos;

import com.lykos.bean.One;
import com.lykos.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;

@Import(AppConfig.class)
public class Rocket {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.register(Rocket.class);
		ac.refresh();
		ac.getBean(One.class).say();

	}
}
