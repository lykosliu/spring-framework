package com.lykos.ioc.chapter5;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class MyEnvironmentAware implements EnvironmentAware {
	private Environment environment;
	@Override
	public void setEnvironment(Environment environment) {
		this.environment = environment;
	}
	public String getProperty(String key){
		return environment.getProperty(key);
	}
}
