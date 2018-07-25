package com.deloitte.in;

public class Bird extends Animal implements Flyer {

	@Override
	public void takeoff() {
		
		System.out.println("bird is taking off");

	}

	@Override
	public void land() {
		System.out.println("bird is landing");


	}

	@Override
	public void fly() {
		System.out.println("bird is flying");

	}
	
public void buildnest() {
		
		System.out.println("bird's nest");
		

	}

	public void layEggs() {
	
	System.out.println("bird layed eggs");
	

}

}
