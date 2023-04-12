package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import com.example.demo.student.Student;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	// @RequestMapping("/hello")
	@GetMapping("/helloString")
	public String helloString() {
		return "Hola Mundo!";
	}

	@GetMapping("/helloList")
	public List<String> helloList() {
		return List.of("Hola", "Mundo");
	}

}
