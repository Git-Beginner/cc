package com.poc.cc;

public class Main {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		System.out.println(calculator.extrapolate(5, 6));
		System.out.println(calculator.compute(4, 8));
	}

}
