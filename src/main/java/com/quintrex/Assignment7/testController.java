package com.quintrex.Assignment7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class testController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/home")
	public String getUser() {
		ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8080/user",String.class);
		return response.getBody();
	}
	
	@PostMapping("/home")
	public String postUser() {
		ResponseEntity<String> response = restTemplate.postForEntity("http://localhost:user", getUser(), null);
		return null;
	}
}
