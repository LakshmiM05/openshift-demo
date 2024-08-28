package com.example.openshift;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@GetMapping("/welcome")
	public String welcome(){
		return "Spring Boot Docker Demo";
	}
}
