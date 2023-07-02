package com.wipro.lambdas;

@FunctionalInterface
interface Summation {
	public void add(int a, int b);
}

public class AppTwo {

	public static void main(String[] args) {
		Summation summation = (a, b) -> {
			System.out.println("Sum of a,b is:" + (a + b));
		};
		summation.add(5, 5);
	}
}
