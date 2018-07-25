package com.deloitte.in;

public class Superman extends Kryptonian implements Flyer {

	@Override
	public void takeoff() {
		System.out.println("superman is taking off");

	}

	@Override
	public void land() {
		System.out.println("superman is landing");


	}

	@Override
	public void fly() {
		System.out.println("superman is flying");


	}
	
	
	
	public void leapBuilding() {
		
		System.out.println("superman is leaping buildings");
		

	}
	
	
public void stopBullet() {
		
		System.out.println("superman is stopping bullets");
		

	}
}
