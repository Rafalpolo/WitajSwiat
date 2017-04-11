package com.test.takitest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Kontroler {
	
	
	// na stronie http://localhost:8080/hello wyœwietli siê nam napis Hello World
	@RequestMapping("/hello")
	public String przywitanie(){
		return "Hello World";
	}

}
