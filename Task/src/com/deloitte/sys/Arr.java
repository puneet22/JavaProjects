package com.deloitte.sys;

public class Arr {

	public static void main(String[] args) {
		
		int[]array1;
		array1=new int[10];
		
		int array2[]= {1,23,4,5,6,};
		
		System.out.println("array2");		
		  
		for(int targ:array2) {
			System.out.println(targ);
		}

		System.out.println("array1");
		System.arraycopy(array2,0,array1,0,5);
		
		for(int i:array1) {
			
			System.out.println(i);
		}
	}

}
