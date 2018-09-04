package com.stackroute.program3;
 class Operations 
{
	 String s1=new String("I am legend");
		String s2=new String("I am legend");
	public void equals()
	{
		
		if(s1.equals(s2))
		{
			System.out.println("Equals Method");
		}
		else
		{
			System.out.println("No Equals Method");
		}
	}
	public void equal()
	{
		
		if(s1==s2)
		{
			System.out.println("equal method");
		}
		else
		{
			System.out.println("No equal method");
		}
		
	}
}

public class StringEquals extends Operations {

	public static void main(String[] args) {
		Operations op=new StringEquals();
		op.equals();
		op.equal();

	}
}
