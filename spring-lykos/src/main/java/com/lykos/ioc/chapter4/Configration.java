package com.lykos.ioc.chapter4;

import com.lykos.ioc.pojo.Person;
import com.lykos.ioc.pojo.Television;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configration {
	@Bean
	public Person person(){
		Person person = new Person();
		person.setName("annotation init");
		return person;
	}

	@Bean
	public Television television(){
		return new Television();
	}
}
