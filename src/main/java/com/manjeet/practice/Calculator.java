package com.manjeet.practice;

public class Calculator {

	public int add(int i, int j) {
		if(i == Integer.MAX_VALUE || j == Integer.MAX_VALUE)
			throw new IllegalArgumentException("bad values: " + i + ", " + j);
		return i + j;
	}
	
	public int subtract(int i, int j) {
		if(i == Integer.MAX_VALUE || j == Integer.MAX_VALUE)
			throw new IllegalArgumentException("bad values: " + i + ", " + j);
		return i - j;
	}
	
	public int multiply(int i, int j) {
		if(i == Integer.MAX_VALUE || j == Integer.MAX_VALUE)
			throw new IllegalArgumentException("bad values: " + i + ", " + j);
		return i * j;
	}
	
	public int divide(int i, int j) {
		if(i == Integer.MAX_VALUE || j == Integer.MAX_VALUE)
			throw new IllegalArgumentException("bad values: " + i + ", " + j);
		return i / j;
	}
	
}
