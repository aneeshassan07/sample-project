package com.sample.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

class CalcServiceTest {

//	@InjectMocks
	AddService addService = new AddServiceImpl();
	
	@Test
	void testCalc() {
//		AddService addService=(int num1, int num2)-> num1+num2;
		CalcService cs=new CalcService(addService);
		assertEquals(5, cs.calc(2, 3));
	}

}
