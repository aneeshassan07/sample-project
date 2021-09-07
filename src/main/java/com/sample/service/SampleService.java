package com.sample.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SampleService {

	public List<String> listName() {
		List<String> names = new ArrayList<String>();
		names.add("Bijoy");
		names.add("Manu");
		names.add("Das");
		return names;
	}

}
