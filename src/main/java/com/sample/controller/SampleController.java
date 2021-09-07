package com.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.service.SampleService;

@RestController
@RequestMapping("/demo")
public class SampleController {
	
	@Autowired
	SampleService sampleService;
	
	@GetMapping("/welcome")
	public String sayHi() {
		return "Welcome to project";
	}
	
	@GetMapping("/listnames")
	public List<String> listNames() {
		return sampleService.listName();
	}
}
