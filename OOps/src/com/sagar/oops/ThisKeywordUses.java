package com.sagar.oops;

class Box {

	private int l, b, h;

	void setDimension(int l, int b, int h) {
		System.out.println("setInside");
		this.l = l;
		this.b = b;
		this.h = h;

	}

	int[] ans = new int[3];

	int[] getDimension() {
		System.out.println("getDimension");

		ans[0] = this.l;
		ans[1] = this.b;
		ans[2] = this.h;
		return ans;
	}

}

class ThisKeywordUses {

	public static void main(String[] args) {
		Box b1 = new Box();
		b1.setDimension(10, 20, 30);
		int[] arr = b1.getDimension();
		System.out.printf("%d ,%d ,%d", arr[0], arr[1], arr[2]);

	}
}
