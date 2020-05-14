package com.nineleaps.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigA {

	@Bean
	public A getA()
	{
		return new A();
	}
}
