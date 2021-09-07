package com.sample.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class SampleServiceTest {

	
	@Test
	public void testListName() {
		SampleService sampleService = new SampleService();
		List<String> names = new ArrayList<String>();
		names.add("Bijoy");
		names.add("Manu");
		names.add("Das");
		assertEquals(names,sampleService.listName());
	}

}
