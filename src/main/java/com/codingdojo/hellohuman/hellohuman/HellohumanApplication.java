package com.codingdojo.hellohuman.hellohuman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class HellohumanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellohumanApplication.class, args);
	}

	@RequestMapping("/hello")
	public String helloHuman(){
		return "Hello Human";
	}

	@RequestMapping("/hello/{name}")
	public String helloName(@PathVariable("name") String name){
		return "Hello " + name;
	}
	

}
