package com.udemy.oops;

public class MotorBike {

	// Attributes//state

	private int speed; // member variable

	// Methods

	void start() {
		System.out.println("Bike Started");
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
