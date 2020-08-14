package com.example.demo.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.demo.Condition.UserCondition;
import com.example.demo.Inteceptor.RequesHeaderInterceptor;

@Configuration
public class UserConfig implements WebMvcConfigurer {
	
	@Autowired
	private RequesHeaderInterceptor interceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		registry.addInterceptor(interceptor);
	}
	@Conditional(UserCondition.class)
	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
				 
		
	
	

}
