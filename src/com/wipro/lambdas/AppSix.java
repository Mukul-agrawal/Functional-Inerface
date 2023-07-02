package com.wipro.lambdas;

interface Eligible {
	public boolean isEligible(int age);
}

public class AppSix {

	private static void isEligibleToVote(int[] citizenAges, Eligible eligible) {
		for (int age : citizenAges) {
			if (eligible.isEligible(age))
				System.out.println(age);
		}

	}

	public static void main(String[] args) {
		int[] citizenAges = { 15, 19, 20, 40, 55, 17, 14 };
		isEligibleToVote(citizenAges, age -> age >= 18);

	}

}
