package com.example.demo.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.example.demo"))
				.paths(a->a.contains("/api"))
				//.paths(PathSelectors.ant("/api/*")) 
				.build()
				.apiInfo(apiInfo());
		
				
	}
	@SuppressWarnings("deprecation")
	private ApiInfo apiInfo() {
		return new ApiInfo("User Api Documentation",
				"Documentation of Spring Boot Api",
				"1.0", "https://swagger.io/",
				"stipebabic9@gmail.com",
				"User licence",
				"https://smartbear.com"
				);
	}

	
}
