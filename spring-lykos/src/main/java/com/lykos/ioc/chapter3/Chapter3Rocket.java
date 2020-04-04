package com.lykos.ioc.chapter3;

import com.lykos.factory.PersonFactoryBean;
import com.lykos.ioc.chapter2.ChildBean;
import com.lykos.ioc.chapter2.Observer;
import com.lykos.ioc.chapter2.Subject;
import com.lykos.ioc.pojo.Person;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.Constants;
import org.springframework.core.convert.Property;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.util.StringValueResolver;

import java.util.Properties;

public class Chapter3Rocket {
	public static void main(String[] args) throws Exception {
		chapter3_1();
	}

	public static void chapter3_1() throws Exception{
		//这里的构造参数也支持设置多个文件
		ConfigurableApplicationContext ac = new ClassPathXmlApplicationContext("chapter3/beans_3.xml");
//		System.out.println(ac.getBean("person"));
//		ac.getBean(ITransportation.class).transport();
//		System.out.println(ac.getBean(Person.class));
//		System.out.println(ac.getBean(Person.class));
//		PersonFactoryBean personFactoryBean = (PersonFactoryBean)ac.getBean("&personByFactoryBean");
//		System.out.println(personFactoryBean.getObject());
	}

}
