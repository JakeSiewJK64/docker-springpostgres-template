package com.firstdocker.demodocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemodockerApplication {

	@RequestMapping("/")
	public String home() {
		return "hello docker";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemodockerApplication.class, args);
	}

}
