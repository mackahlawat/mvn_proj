package com.manjeet.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.manjeet.practice.Calculator;

public class CalculatorTest {
	
	@Test
	public void testAddPositiveNumbers() {
		Calculator c = new Calculator();
		int result = c.add(10, 20);
		Assert.assertNotEquals(result, 29);
		Assert.assertEquals(result, 30);
	}
	
	@Test
	public void testAddNegativeNumbers() {
		Calculator c = new Calculator();
		int result = c.add(-10, -20);
		Assert.assertEquals(result, -30);
	}
	
	@Test
	public void testAddOneZero() {
		Calculator c = new Calculator();
		int result = c.add(10, 0);
		Assert.assertEquals(result, 10);
	}
	
	@Test
	public void testAddOpposite() {
		Calculator c = new Calculator();
		int result = c.add(10, -10);
		Assert.assertEquals(result, 0);
	}
	
	@Test
	public void testAddOnePositiveOneNegative() {
		Calculator c = new Calculator();
		int result = c.add(10, -7);
		Assert.assertEquals(result, 3);
	}
	
	@Test(expectedExceptions = {IllegalArgumentException.class})
	public void testAddVeryLargeNumbers() {
		Calculator c = new Calculator();
		c.add(Integer.MAX_VALUE, Integer.MAX_VALUE);
	}

}
