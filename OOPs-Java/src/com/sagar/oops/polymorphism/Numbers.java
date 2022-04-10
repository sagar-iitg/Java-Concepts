package com.sagar.oops.polymorphism;

public class Numbers {

	int sum(int a, int b) {
		return a + b;
	}

	int sum(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		Numbers obj = new Numbers();
		int ans1 = obj.sum(2, 3);
		System.out.println(ans1);
		int ans2 = obj.sum(4, 5, 6);
		System.out.println(ans2);

	}
}
