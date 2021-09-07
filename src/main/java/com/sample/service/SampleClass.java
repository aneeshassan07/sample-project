package com.sample.service;

public class SampleClass {
	
	
	public boolean findOdd(int num) {
		
		return 	num/2==0?false:true;
	}
	
	public static void main(String args[]) {
		SampleClass sc=new SampleClass();
		System.out.println(sc.findOdd(13));
	}
}
