package com.deloitte.cui;

public class ArrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int num[];
	num=new int[10];
	num[3]=879;
	for(int target:num) {
		
		System.out.println(target);
		
	}
			System.out.println();
			
			int arr[][],a,b,c;
			 arr=new int[4][4];
			arr[1][1]=3;
			arr[2][2]=5;
			arr[3][3]=6;
			 for(int target[]: arr) {
				 for(int targ:target) {
					 System.out.println("\t" + targ);
					 
				 }
			 }
				
	}

}
