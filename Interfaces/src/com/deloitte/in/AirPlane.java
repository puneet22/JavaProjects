package com.deloitte.in;

public class AirPlane extends Vehicle implements Flyer {

	
	public void takeoff() {
		
System.out.println("plane taking off");
	}

	
	public void land() {
		
System.out.println(" plane landing");
	}

	
	public void fly() {
		
System.out.println("plane flying");
	}

}
