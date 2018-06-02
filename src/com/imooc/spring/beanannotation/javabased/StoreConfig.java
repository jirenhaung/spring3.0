package com.imooc.spring.beanannotation.javabased;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("config.xml")
public class StoreConfig {
	@Value("${url}")
	private String url;
	
	@Value("${jdbc.username}")
	private String username;
	@Value("${password}")
	private String password;
	
	@Bean
	public MyDriverManager myDriverManager(){
		return new MyDriverManager(url, username, password);
	}
//	@Bean(name="store")
//	public Store getStringStore(){
//		return new StringStore();
//	}
}
