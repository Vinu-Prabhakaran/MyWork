package com.vinu.springboot.topic.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.DocExpansion;
import springfox.documentation.swagger.web.OperationsSorter;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger.web.UiConfigurationBuilder;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	UiConfiguration uiConfig=UiConfigurationBuilder.builder()
			.docExpansion(DocExpansion.NONE)
			.displayOperationId(true)
			.displayRequestDuration(true)
			.filter(false)
			.maxDisplayedTags(100)
			.operationsSorter(OperationsSorter.ALPHA)
			.supportedSubmitMethods(new String[] {"get","post","put","delete"})
			.build();
	
	@Bean
	public Docket api() {
		
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.regex("/topics.*"))
				.build().apiInfo(topicApiInfo());
		
	}
	
	private ApiInfo topicApiInfo() {
		
		return new ApiInfoBuilder().title("Spring Boot Topic ReST Api")
				.description("Topic Management ReST API")
				.contact(new Contact("Vinu Prabhakaran", "https://www.vinus-website.com", "vinu.cp@gmail.com"))
				.version("1.0")
				.build();
	}
}
