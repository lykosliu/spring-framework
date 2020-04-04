package com.lykos.factory;

import com.lykos.ioc.pojo.Person;
import org.springframework.beans.factory.FactoryBean;

public class PersonFactoryBean implements FactoryBean {
	@Override
	public Object getObject() throws Exception {
		Person person = new Person();
		person.setName("create by factory bean "+System.currentTimeMillis());
		return person;
	}

	@Override
	public Class<?> getObjectType() {
		return Person.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

	public void initM(){
		System.out.println("PersonFactoryBean initM method has bean execed");
	}
}
