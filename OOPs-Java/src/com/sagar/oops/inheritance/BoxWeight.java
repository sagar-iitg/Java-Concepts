package com.sagar.oops.inheritance;

//inheritance  extends keyword	 
public class BoxWeight extends Box {

	double weight;

	public BoxWeight(double l, double h, double w, double weight) {
		super(l, h, w);
		System.out.println(super.l);
		this.weight = weight;
	}

	public BoxWeight() {

		this.weight = -1;
	}

}
