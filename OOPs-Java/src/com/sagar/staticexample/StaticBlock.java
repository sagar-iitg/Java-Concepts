package com.sagar.staticexample;

//this is a demo to show initialisation of static variable 

public class StaticBlock {

	static int a = 4;
	static int b;

	// static block

	// will run once, when the first object is create i.e. when the class
	// is loaded for the first time
	static {

		System.out.println("i am in static block");
		b = a * 5;

	}

	public static void main(String[] args) {

		StaticBlock obj = new StaticBlock();
		System.out.println(obj.a + " " + obj.b);
		System.out.println(StaticBlock.a + " " + StaticBlock.b);

	}

}
