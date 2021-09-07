package com.sample.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SampleControllerTest {
	
	@Test
	public void test() {
		System.out.println("This test");
	}
	
	@Test
	public void sayHiTest() {
		SampleController sampleController = new SampleController();
		assertEquals("Welcome to project", sampleController.sayHi());
	}

}
