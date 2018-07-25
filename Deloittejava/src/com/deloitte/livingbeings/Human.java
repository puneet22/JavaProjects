package com.deloitte.livingbeings;

import com.deloitte.livingbeings.organs.Eye;

public class Human extends Mammals{
	
	public HumanEye leftEye,rightEye; 
	public  Human(){
		
		leftEye=new HumanEye();
		rightEye=new HumanEye();
	}

	public class HumanEye extends Eye{

	
	
	}
}


