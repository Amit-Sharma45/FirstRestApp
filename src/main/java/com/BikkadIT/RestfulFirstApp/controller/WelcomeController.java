package com.BikkadIT.RestfulFirstApp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcomeController")
public class WelcomeController {

	@GetMapping("/wel")
	public ResponseEntity<String> welcome() {
//		int a=10/0;
		String msg = "Welcome to Bikkad IT";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}

	@GetMapping("/wel1")
	public String welcome1() {
		String msg = "Welcome to IT Field";
		return msg;
	}
}
