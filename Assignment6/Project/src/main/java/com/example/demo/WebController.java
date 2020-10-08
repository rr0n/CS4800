package com.example.demo;

import org.springframework.web.bind.annotation.*;

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
		return new GoogleGuavaSample().getList();
	}
	
	@GetMapping("/guava_test2")
	public List<String> splitTest(@RequestParam(value = "str", defaultValue = "") String str) {
		return new GoogleGuavaSample().getSplit(str);
	}
	
}
