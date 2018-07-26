package com.deloitte.cui;


class Point{
	
	public int x,y;

	Point(int x,int y ){
		this.x=x;
		this.y=y;
		
	}
	
	@Override
	public String toString() {

		return x+" , "+y ;
	}
	
	
	@Override
	public boolean equals(Object target) {
		
		if(target!=null) {
			
			if(target instanceof Point) {
				
				Point point=(Point)target;
				if(point.x==x&&point.y==y)
					return true;
				
			}
		}
		return false;
		
		
		
		
	}
	
	
	}



public class MainClass {

	public static void main(String[] args) {
		
		Point p=new Point(3,6);
		String str;
		
		str="X & Y : " +p;
		
		System.out.println(str);
		
	Point p1=new Point(4,6);
	Point p2=new Point(3,9);
		
		System.out.println(p1.equals(p2));
		
		



	}

}
