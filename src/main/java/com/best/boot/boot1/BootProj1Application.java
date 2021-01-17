package com.best.boot.boot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.best.boot.boot1.model.Student;

@SpringBootApplication
public class BootProj1Application {

	public static void main(String[] args) {
		SpringApplication.run(BootProj1Application.class, args);
	}
	
	@GetMapping("/test")
	public @ResponseBody String hello() {
		return "Yes Spring boot is ok";
	}

	@GetMapping("/student")
	public @ResponseBody Student getStudent() {
		return new Student(1L,"Mg Mg","09234343");
	}
}
