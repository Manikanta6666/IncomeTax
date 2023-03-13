package com.capg.taxCalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;



@EnableEurekaClient
@EntityScan("com..") 
@EnableJpaRepositories(basePackages = "com..")
@ComponentScan("com..")
@SpringBootApplication
@OpenAPIDefinition(info=@Info(title="TaxCalculator",version="3.0",description="Tax Calculator MicroService"))
public class TaxCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaxCalculatorApplication.class, args);
	}
	@Bean
	//@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
