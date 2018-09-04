package com.stackroute.program11;

public class UncheckedException {

	public static void main(String[] args) {
		int num1=10;
		int num2=0;
		try
		{
			int num3=num1/num2;
			System.out.println(num3);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}

}
