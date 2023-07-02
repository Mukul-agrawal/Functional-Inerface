package com.wipro.lambdas;

import java.util.Arrays;
import java.util.List;

interface Countable {
	public int countChars(String city);
}

public class AppFour {
	private static void findNoOfChars(String city, Countable countable) {
		System.out.println(city + " has " + countable.countChars(city) + " chars");

	}

	public static void main(String[] args) {
		List<String> cityList = Arrays.asList("Vizag", "Pune", "Bangalore", "Delhi", "Patna");

		// Countable countable = city -> city.length();

		for (String city : cityList) {
			// findNoOfChars(city, countable);
			findNoOfChars(city, citi -> citi.length());
		}

	}

}
