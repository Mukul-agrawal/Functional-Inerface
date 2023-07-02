package com.wipro.lambdas;

import java.util.Arrays;
import java.util.List;

interface CountableCity {
	public int countChars(String city);
}

public class AppFive {
	private static void findNoOfChars(List<String> cityList, Countable countable) {
		for (String city : cityList) {
			System.out.println(city + " has " + countable.countChars(city) + " chars");
		}

	}

	public static void main(String[] args) {
		List<String> cityList = Arrays.asList("Vizag", "Pune", "Bangalore", "Delhi", "Patna");

		findNoOfChars(cityList, citi -> citi.length());

	}

}
