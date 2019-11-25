package com.lykos.config;

import com.lykos.bean.One;
import org.springframework.context.annotation.Bean;

public class AppConfig {

	@Bean
	public One one(){
		return new One();
	}
}
