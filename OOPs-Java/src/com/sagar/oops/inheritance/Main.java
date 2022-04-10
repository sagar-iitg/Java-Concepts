package com.sagar.oops.inheritance;

public class Main {

	public static void main(String[] args) {

		Box box = new Box(4);
		Box box1 = new Box(box);

//		System.out.println(" " + box.w + " " + box.h);
//		System.out.println(" " + box1.w + " " + box1.h);
//		BoxWeight box3 = new BoxWeight();
//		System.out.println(box3.weight);

		BoxWeight box4 = new BoxWeight(2, 3, 4, 5);
		System.out.println(box4.l + " " + box4.w + " " + box4.h + " " + box4.weight);

	}

}
