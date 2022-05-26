package com.customer.orders;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class CustomerOrdersApplication extends SpringBootServletInitializer {
	
	@Bean
	WebClient webClient(){
		
	return	WebClient.create("http://localhost:9090");
	}

	@Bean
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}
	
	@Bean
	RestTemplate restTemplate() {
		
		return new RestTemplate(); 
	}
	
	 @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	        return builder.sources(CustomerOrdersApplication.class);
	    }

	public static void main(String[] args) {
		SpringApplication.run(CustomerOrdersApplication.class, args);
	}

}
