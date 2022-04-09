package com.sagar.staticexample;

//outside classes cannot be static
//inner classes can be static

public class InnerClasses {

	static class Test {

		String name;

		public Test(String name) {
			// TODO Auto-generated constructor stub
			this.name = name;
		}

		@Override
		public String toString() {
			return "Test [name=" + name + "]";
		}

	}

	public static void main(String[] args) {

		Test a = new Test("sk");
		System.out.println(a);

	}
}
