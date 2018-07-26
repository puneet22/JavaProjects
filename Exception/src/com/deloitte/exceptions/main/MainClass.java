package com.deloitte.exceptions.main;

public class MainClass {

	public static void main(String[] param) {
		
		
		try {
			
			System.out.println(Integer.parseInt(param[0])/Integer.parseInt(param[1]));
		}
		
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("give 2 input");}
			
		catch (ArithmeticException e ) {
			System.out.println("2nd input cannot be 0");}
		
		catch (NumberFormatException eh ) {
			System.out.println("give valid inputs");}
		
	}
	
}

				
			
			
		

