package com.responsedata.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class indexControle {
	
	@GetMapping
	public String Start() {
		return "Api Spring 1.0";		
	}

}
