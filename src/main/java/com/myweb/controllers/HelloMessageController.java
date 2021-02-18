package com.myweb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloMessageController {
	
	@GetMapping("/hello")
	public void showMessage(String str) {
		System.out.println("welcome to first web service");
	}

}
