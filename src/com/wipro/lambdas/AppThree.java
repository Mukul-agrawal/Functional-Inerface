package com.wipro.lambdas;

interface Textable {
	public int countChars(String text);
}

public class AppThree {

	public static void main(String[] args) {
		Textable textable = (text) -> text.length();

		int count = textable.countChars("Hello World");
		System.out.println(count);
	}

}
