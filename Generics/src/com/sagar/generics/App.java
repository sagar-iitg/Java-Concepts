package com.sagar.generics;

class Store {
	private Object item;

	public void setItem(Object item) {
		this.item = item;
	}

	public Object getItem() {
		return this.item;
	}

}

public class App {

	public static void main(String[] args) {

		Store s = new Store();
		s.setItem(5.5f);
		// System.out.println(s.getItem());
		float a = (float) s.getItem();

		System.out.println(a);

	}
}
