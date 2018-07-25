package com.deloitte.cui;

  class Point {
	public int x,y;
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Point [] points;
    points=new Point[3];
    points[0]=new Point();
    points[2]=new Point();
    points[0].x=3;
    points[0].y=7;
    points[2].x=5;
    points[2].y=9;
    
    
    for (Point point:points) {
    	if(point !=null) {
    		System.out.println(point.x+","+point.y);
    	}
    }
		
	}

}
