package com.deloitte.calc;

public class Division extends Arithmetic {
	public Division(int num1, int num2) {
		setNum1(num1);
		setNum2(num2);

		 }
	@Override
	public int calculate() {
		
		int res;
		
			try {
				res=(int)num1/num2;
				return res;
				}
		catch(ArithmeticException e) {
			System.out.println("divison by zero is undefined");
			
		}
			return 0;
		
		}

}
