package com.sagar.singleton;

public class Singleton {

	// private int num;

	private Singleton() {
		// TODO Auto-generated constructor stub

	}

	private static Singleton instance;

	public static Singleton getInstance() {

		// check 1 object is created or not

		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

}
