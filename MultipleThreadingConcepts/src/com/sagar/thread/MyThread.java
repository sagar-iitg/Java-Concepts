package com.sagar.thread;

public class MyThread extends Thread {

	@Override
	public void run() {

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

}
