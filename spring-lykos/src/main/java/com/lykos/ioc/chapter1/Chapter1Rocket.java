package com.lykos.ioc.chapter1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Chapter1Rocket {
	public static void main(String[] args) {
		//这里的构造参数也支持设置多个文件
		ApplicationContext ac = new ClassPathXmlApplicationContext("chapter1/subject.xml");
		Subject subject = ac.getBean(Subject.class);
		System.out.println(subject.getObservers());
	}
}
