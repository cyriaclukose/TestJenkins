package com.test.learn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	
	
	@RequestMapping("/greetings")
	public String greeting()
	{
		return "hello world greetings to jenkins";
	}

}
