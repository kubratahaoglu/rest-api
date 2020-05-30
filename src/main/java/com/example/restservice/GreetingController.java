package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String template = "%s";

	@GetMapping("/whoami")
	public Greeting greeting(@RequestParam(value = "firstname", defaultValue = "Hatice Kübra") String firstname, @RequestParam(value = "lastname", defaultValue = "Tahaoğlu") String lastname) {
		return new Greeting(String.format(template, firstname), String.format(template, lastname));
	}
}