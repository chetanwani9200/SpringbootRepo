package com.product.service.controller1;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class WelcomeController {
	@GetMapping("/hello")
public String getMsg() {
	return "hello";
}
	
	@Value("${app.name}")
	public String name;
	
	@GetMapping("/name1")
	public String getName() {
		return name;
		
	}
}
