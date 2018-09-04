package com.stackroute.program13;

public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int arr[]=new int[10];
			int i=0;
			System.out.println("displaying AIOB");
			for( i=0;i<20;i++)
			{
				arr[i]=i;
			}
			System.out.println(arr[i]);
			try
			{
				int num=Integer.parseInt("abc");
				System.out.println(num);
			}
			catch(NumberFormatException e)
			{
				System.out.println(e);
			}
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println(ae);
		}


	}

}
