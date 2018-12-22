package com.MyStory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.MyStory"})
public class MyStoryApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(MyStoryApplication.class, args);
	}
}
