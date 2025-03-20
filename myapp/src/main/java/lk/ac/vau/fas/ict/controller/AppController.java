package lk.ac.vau.fas.ict.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class AppController {
	@GetMapping("/msg")
	public String MyMessage() {
		return "Hello SpringBoot";
	}
	
	@GetMapping("/name")
	public String MyName() {
		return "My name is SpringBoot";
	}

}
