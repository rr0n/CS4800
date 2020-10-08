package com.cs4800.assignment3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

	private static final String template = "%s";
	
	@GetMapping("/welcome")
	public String welcome() {
		return new Message(String.format(template, "Welcome, This is our project!")).getMessage();
	}
}
