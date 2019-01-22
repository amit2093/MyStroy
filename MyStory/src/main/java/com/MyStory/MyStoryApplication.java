package com.MyStory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@ComponentScan(basePackages= {"com.MyStory"})
public class MyStoryApplication {
	
	public static void main(String[] args) {    
		SpringApplication.run(MyStoryApplication.class, args);
	}
	
	@GetMapping("/")
	public String testMethod() {
		return "index";
	}
//	@Bean
//	public RestTemplate restTemplate() {
//	    return new RestTemplate();
//	}
//	
//	@Bean
//	public RestTemplate restTemplate(RestTemplateBuilder builder) {
//	   // Do any additional configuration here
//	   return builder.build();
//	}

}
