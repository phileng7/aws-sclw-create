package com.sclw.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

	@GetMapping("/")
	public ResponseEntity<String> home() {
		return new ResponseEntity<String>("Greetings from SCLW Create Microservice!", HttpStatus.OK);
	}
}
