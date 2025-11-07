package com.myfullstackproject.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myfullstackproject.demo.service.HelloService;

@RestController
public class HelloController {

	private final HelloService helloService;
	
	//Constructor Injection 
	public HelloController(HelloService helloService) {
		this.helloService = helloService;
	}
	
	@GetMapping("/hello")
	public String sayHello() {
		return helloService.getHelloMessage();
	}
}
