package com.MyProject100.MyProject100;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class MyProject100Application {
	@GetMapping("/welcome")
	public String welcome(){
		return "welcome to myassignment";
	}
	// git init
	// git add README.md
	// git commit -m "first commit"
	// git branch -M main
	// git remote add origin https://github.com/AbdulAhadl/projecect100.git
	// git push -u origin main

	public static void main(String[] args) {
		SpringApplication.run(MyProject100Application.class, args);
	}

}
