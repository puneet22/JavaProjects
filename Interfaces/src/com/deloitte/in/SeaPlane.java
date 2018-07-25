package com.deloitte.in;

public class SeaPlane extends AirPlane implements Sailer {
	
	public void dock(){
		System.out.println("at dock");
			}

			@Override
			public void cruise(){
			
				System.out.println("cruising");
			}

}
