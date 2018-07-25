package com.deloitte.cui;



public class MainClass {

		

	
	public static void main(String[] args) {
		
		
     	
		Point p1,p2;
		
		p1=new Point();
		
		
		p1.x=10;
		p1.y=15;
		
		System.out.println(p1.x + "\t" + p1.y);
		 
		p2=new Point();

		p2.x=10;
		p2.y=15;
		p2=p1;
		System.out.println(p2.x + "\t" + p2.y);
		
		p2.x=70;
		p2.y=65;
		System.out.println(p1.x + "\t" + p1.y);

	}
}
