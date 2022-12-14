package com.axis.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/microservice3")
public class microservice3controller {
	@RequestMapping("/greet3")
	public String greet() {
		return "this is greet 3";
	}
}
