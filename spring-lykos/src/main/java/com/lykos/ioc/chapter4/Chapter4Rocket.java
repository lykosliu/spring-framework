package com.lykos.ioc.chapter4;

import com.lykos.ioc.pojo.House;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

import java.util.Arrays;

public class Chapter4Rocket {
	public static void main(String[] args) {
//		ConfigurableApplicationContext ac = new ClassPathXmlApplicationContext("chapter4/config.xml");
//		System.out.println(ac.getBean(House.class).getPerson());
//		System.out.println(ac.getBean(ChapterHouse.class).getPerson());
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(ChapterHouse.class,Chapter4Component.class);
	}
}
