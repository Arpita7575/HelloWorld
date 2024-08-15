package com.first;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
	
	@GetMapping("/test")
	public String first()
	{
		return "Hello World";
	}

}
