package com.local.api.manage.exam.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:manage.exam.properties")
public class ManageExamConfig {
	
	@Value("${manage.exam.exception}")
	private String messageExceptionDeleteById;
	@Value("${manage.exam}")
	private String messageDeleteById;
	
}
