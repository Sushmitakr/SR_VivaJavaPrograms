package com.stackroute.program7;
class Valuehold
{
	public int value=10;
}
public class Objectref {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Objectref obj=new Objectref();
		obj.method();
	}
	public void method()
	{
		Valuehold val=new Valuehold();
		val.value=10;
		System.out.println("Value before initializing:"+val.value);
		another(val);
		System.out.println("Value after initializing:"+val.value);
	}
	public void another(Valuehold val)
	{
		val.value=20;
		System.out.println("Value in another"+val.value);
	}
	
}
