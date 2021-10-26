package com.udemy.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotorBike ducati = new MotorBike();
		MotorBike honda = new MotorBike();

		ducati.start();
		honda.start();
		ducati.setSpeed(100);
		ducati.setSpeed(800);
		honda.setSpeed(0);
		honda.setSpeed(25);
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());

	}

}
