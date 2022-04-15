package com.sagar.object.classdemo;

public class ObjectDemo {

	int num;

	public ObjectDemo(int num) {
		super();
		this.num = num;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public static void main(String[] args) {
		ObjectDemo obj = new ObjectDemo(34);
		ObjectDemo obj1 = new ObjectDemo(34);
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
	}

}
