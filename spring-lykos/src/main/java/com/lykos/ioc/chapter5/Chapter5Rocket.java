package com.lykos.ioc.chapter5;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.Locale;
import java.util.Properties;

@ComponentScan("com.lykos.ioc.chapter5")
@Import(PropertySourcesPlaceholderConfigurer.class)
public class Chapter5Rocket {
	public static void main(String[] args) throws Exception{
//		DefaultResourceLoader defaultResourceLoader = new DefaultResourceLoader();
////		Resource resource = defaultResourceLoader.getResource("file:/Users/lykosliu/demo/a");
//		PathMatchingResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();
//		Resource[] resources = resourcePatternResolver.getResources("file:/Users/lykosliu/demo/*.properties");
//		for(Resource r : resources){
//			Properties properties = new Properties();
//			PropertiesLoaderUtils.fillProperties(properties, new EncodedResource(r,"utf-8"));
//			System.out.println("404:"+properties.get("name")+" path="+r.getURL().getPath());
//		}

		one();
	}

	private static void one() throws IOException {
		ApplicationContext ac = new AnnotationConfigApplicationContext(Chapter5Rocket.class);
		ac.publishEvent(new MyApplicationEvent(""));
//		ConfigurableListableBeanFactory clbf = (ConfigurableListableBeanFactory)ac.getBeanFactory();
//		clbf.registerSingleton("b",new B());
		System.out.println(ac.getBean(A.class).getProperty("user.name"));
		ac.getBean(MyApplicationEventPublisher.class).applicationEventPublisher.publishEvent(new MyApplicationEvent("a"));
//		System.out.println(ac.getBean(A.class).getMessage());
//		System.out.println(ac.getBean("b"));
		System.out.println(ac.getBean(MyEnvironmentAware.class).getProperty("user.name"));
		System.out.println(ac.getMessage("404",null,"defaultMessage", Locale.JAPANESE));
		System.out.println(ac.getMessage("404",null,"defaultMessage", Locale.ENGLISH));
		System.out.println(ac.getMessage("404",null,"defaultMessage", Locale.CHINESE));
		ClassPathResource resource = (ClassPathResource)ac.getResource("chapter1/subject.xml");
//		Resource [] resources = ac.getResources("classpath*:META-INF/**/pom.properties");
		Resource[] resources = ac.getResources("classpath:META-INF/maven/ch.qos.logback/logback-classic/pom.properties");
		for(Resource r : resources){
			Properties properties = new Properties();
			PropertiesLoaderUtils.fillProperties(properties, new EncodedResource(r,"utf-8"));
			System.out.println("artifactId:"+properties.get("artifactId")+" path="+r.getURL().getPath());
		}
		System.out.println(resource);
	}
}
