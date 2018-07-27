package com.deloitte.exceptions.main;

class IllegalAgeException extends Exception{
	
	
	public String getMessage() {
		return "the person needs to be 18 or above for voting";
	}
	
	}

	class Voter{
 		public void register(int age) throws IllegalAgeException{
 			
 			if(age<18) {
 				
 				throw new IllegalAgeException();
 				
 			}
 		}
	}
	
	
public class VoterId {

	public static void main(String[] args) {
	
		Voter voter=new Voter();
		
		try {
				voter.register(80 );
		}
		catch (IllegalAgeException e) {
			e.printStackTrace();
			
			
			
		}

	}

}
