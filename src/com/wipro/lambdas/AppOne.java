package com.wipro.lambdas;

public class AppOne {

	public static void main(String[] args) {

		Runnable myRunnable = () -> {
			for (int i = 0; i < 10; i++)
				System.out.println(i);
		};

		Thread thread = new Thread(myRunnable);
		thread.start();
	}
}
