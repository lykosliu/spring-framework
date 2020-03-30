package com.lykos.ioc.chapter2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Chapter2Rocket {
	public static void main(String[] args) {
//		chapter1();
//		chapter2();
		chapter2_2();

	}

	public static void chapter2_2(){
		//这里的构造参数也支持设置多个文件
		ConfigurableApplicationContext ac = new ClassPathXmlApplicationContext("chapter2/lifecycle.xml");
		ac.registerShutdownHook();
		LifecycleBean lifecycleBean = ac.getBean("lifecycleBean",LifecycleBean.class);

	}

	private static void chapter1() {
		//这里的构造参数也支持设置多个文件
		ApplicationContext ac = new ClassPathXmlApplicationContext("chapter2/subject.xml");
		Subject subject = ac.getBean(Subject.class);
		System.out.println(subject.getObservers()[0]);
		Observer observer_a = ac.getBean("observer_a",Observer.class);
		Observer observer_b = ac.getBean("observer_b",Observer.class);
		Observer observer_c = ac.getBean("observer_c",Observer.class);
		Observer observer_d = ac.getBean("observer_d",Observer.class);
		Observer observer_e = ac.getBean("observer_e",Observer.class);
		Observer observer_from_static_factory = ac.getBean("observer_from_static_factory",Observer.class);
		Observer observer_from_non_static_factory_b = ac.getBean("observer_from_non_static_factory_b",Observer.class);
		Observer observer_constructor = ac.getBean("observer_constructor",Observer.class);
		Observer observer_constructor_arg = ac.getBean("observer_constructor_arg",Observer.class);
		Observer observer_constructor_arg_index = ac.getBean("observer_constructor_arg_index",Observer.class);
		Observer observer = ac.getBean("observer",Observer.class);
		System.out.println("subject.Observers[0]="+observer_a);
		System.out.println("observer_a="+observer_a);
		System.out.println("observer_b="+observer_b);
		System.out.println("observer_c="+observer_c);
		System.out.println("observer_d="+observer_d);
		System.out.println("observer_e="+observer_e);
		System.out.println("observer_from_static_factory="+observer_from_static_factory);
		System.out.println("observer_from_non_static_factory_b="+observer_from_non_static_factory_b);
		System.out.println("observer_constructor="+observer_constructor);
		System.out.println("observer_constructor_arg="+observer_constructor_arg+" name="+observer_constructor_arg.getName());
		System.out.println("observer_constructor_arg_index="+observer_constructor_arg_index+" name="+observer_constructor_arg_index.getName());
		System.out.println("observer="+observer);
	}
}
