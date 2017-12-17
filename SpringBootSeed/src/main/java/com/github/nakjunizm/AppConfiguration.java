package com.github.nakjunizm;

import java.text.SimpleDateFormat;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

@Configuration
@EnableAutoConfiguration
public class AppConfiguration {
	
	@Bean
	public Jackson2ObjectMapperBuilder jacksonBuilder() {
		Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder();
		builder.indentOutput(true);
		builder.dateFormat(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"));
		return builder;
	}

}
