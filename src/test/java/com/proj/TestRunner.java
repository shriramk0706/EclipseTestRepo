package com.proj;

import static org.junit.Assert.*;

import org.jenkins.NumberClass;
import org.junit.Test;

public class TestRunner {

	@Test
	public void addmethod() {
		NumberClass num = new NumberClass();
		int result1 = num.addNumber(10, 5);
		assertEquals(15, result1);
	}
	
	@Test
	public void substractmethod() {
		NumberClass num2 = new NumberClass();
		int result2 = num2.substractNumber(10, 5);
		assertEquals(5, result2);
	}

}
