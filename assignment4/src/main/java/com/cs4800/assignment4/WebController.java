package com.cs4800.assignment4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WebController {

	private static final String template = "%s";
	
	@GetMapping("/welcome")
	public String welcome() {
		return new Message(String.format(template, "Welcome, This is our project!")).getMessage();
	}
	
	//For assignment 4, this is the google guava dependency
	@GetMapping("/guava_test")
	public List<String> guavaTest() {
		return new GoogleGuavaTest().getList();
	}
	
}
