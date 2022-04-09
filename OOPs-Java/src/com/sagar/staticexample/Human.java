package com.sagar.staticexample;

public class Human {

	int age;
	String name;
	int salary;
	boolean married;
	static long population;

	// this represents objects;
	// public Constructor

	public Human(int age, String name, int salary, boolean married) {
		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
		this.married = married;
		Human.population += 1;

	}

}
