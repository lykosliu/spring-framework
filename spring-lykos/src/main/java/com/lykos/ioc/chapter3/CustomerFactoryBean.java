package com.lykos.ioc.chapter3;

import lombok.Data;
import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.Proxy;

@Data
public class CustomerFactoryBean implements FactoryBean {

	private Class interfaceClass;
	@Override
	public Object getObject() throws Exception {
		return Proxy.newProxyInstance(CustomerFactoryBean.class.getClassLoader(),new Class[]{interfaceClass},
				(object,method,args)->{
					System.out.println("this is "+interfaceClass.getName()+"."+method.getName() + "() proxy method");
			return null;
		});
	}

	@Override
	public Class<?> getObjectType() {
		return interfaceClass;
	}
}
