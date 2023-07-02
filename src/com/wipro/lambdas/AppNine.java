package com.wipro.lambdas;

interface Testable {
	public void accept(String t);
}

public class AppNine {

	public void printName(String text) {
		System.out.println(text + " -> " + text.length());
	}

	public static void printName2(String text) {
		System.out.println(text + " -> " + text.length());
	}

	public static void main(String[] args) {
		Testable testable = new AppNine()::printName;
		Testable testable2 = AppNine::printName2;
		String[] names = { "Harry", "Jim", "Rahul", "Ram" };

		for (String name : names) {
			testable.accept(name);
		}
		for (String name : names) {
			testable2.accept(name);
		}

	}

}
