package com.sagar.staticexample;

public class Main {

	public static void main(String[] args) {

		Human sagar = new Human(25, "Sagar", 10000, false);
		Human ankit = new Human(26, "ankit", 100000, true);
		Human arpit = new Human(0, null, 0, false);

		System.out.println(Human.population);

		Main m = new Main();
		m.fun2();

		System.out.println("---------------");
		// static function
		fun();

	}

	// this is not dependent to objects

	static void fun() {
		// greeting();
		Main obj = new Main();
		obj.greeting();

	}

	void fun2() {
		greeting();
	}

	void greeting() {
		System.out.println("hello world");
	}
}
