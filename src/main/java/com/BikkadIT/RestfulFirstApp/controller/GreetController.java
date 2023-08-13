package com.BikkadIT.RestfulFirstApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetController")
public class GreetController {

	@GetMapping("/wel")
	public String greet() {
		String msg="Good Morning";
		return msg;
	}
	@GetMapping("/greet")
	public String greet1() {
		String msg="Good Night";
		return msg;
	}
}
