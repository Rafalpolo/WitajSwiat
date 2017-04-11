package com.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Kontroler {
	
	
	// na stronie http://localhost:8080/hello wyswietli sie nam napis Hello World
	@RequestMapping("/hello")
	public String przywitanie(){
		return "Hello World";
	}

}
