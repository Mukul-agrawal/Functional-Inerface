package com.wipro.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppSeven {

	public static void main(String[] args) {
		List<String> cricketerList = new ArrayList<>();
		cricketerList.add("Dhoni");
		cricketerList.add("Kapil dev");
		cricketerList.add("Ganguly");
		cricketerList.add("Dravid");
		cricketerList.add("Sachin tendulkar");
		cricketerList.add("Ajay Jadeja");

		cricketerList.forEach(cricket -> System.out.println(cricket));
		/**
		 * System.out.println("-----Sorting-----"); Collections.sort(cricketerList);
		 * cricketerList.forEach(cricket -> System.out.println(cricket));
		 */
		cricketerList.sort((c1, c2) -> c1.compareTo(c2));
		System.out.println("-----Sorting-----");
		cricketerList.forEach(cricket -> System.out.println(cricket));
	}

}
