package com.deloitte.in;

public class RiverBarge extends Vehicle implements Sailer {

	@Override
	public void dock(){
System.out.println("at dock");
	}

	@Override
	public void cruise(){
	
		System.out.println("cruising");
	}

}
