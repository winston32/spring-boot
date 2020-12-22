package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {
	@GetMapping(path = "/")
	Map<String, String> getUserName() {
		Map userDetails = new HashMap<>();
		userDetails.put("userName", "winston");
		return userDetails;
	}
}
