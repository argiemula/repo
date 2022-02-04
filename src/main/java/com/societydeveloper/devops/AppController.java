package com.societydeveloper.devops;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class AppController {

	@GetMapping("/")
	public String home() {
		return "index";
	}
}
