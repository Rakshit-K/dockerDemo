package com.dockerDemo.dockerDemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1.0")
public class dockerDemoController {

	@GetMapping("/demo")
	public ResponseEntity<String> demoDock(){		
		return ResponseEntity.ok("Hiii.... this api is working cicd demo");
		
	}
}
