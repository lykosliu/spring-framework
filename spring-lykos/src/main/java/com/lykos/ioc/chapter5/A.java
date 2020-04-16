package com.lykos.ioc.chapter5;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Data
@Component
public class A {

	@Profile("abc")
	@Bean("${integerInstance}")
	public Integer createInteger(){
		return 1;
	}

	@Autowired
	Environment environment;

//	@Autowired
//	MessageSource messageSource;

	@Bean
	public ReloadableResourceBundleMessageSource messageSource(){
		ReloadableResourceBundleMessageSource reloadableResourceBundleMessageSource = new ReloadableResourceBundleMessageSource();
		reloadableResourceBundleMessageSource.setBasenames("chapter5/i18n_china");
		reloadableResourceBundleMessageSource.setDefaultEncoding("UTF-8");
		return reloadableResourceBundleMessageSource;
	}

	public String getProperty(String key){
		return environment.getProperty(key);
	}

//	public String getMessage(){
//		return messageSource.getMessage("1000",null,"defaultMessage", Locale.ENGLISH);
//	}
}
