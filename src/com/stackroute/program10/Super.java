package com.stackroute.program10;
 class Child
{
	int a=20;
	int b=10;
}
 class Sub extends Child
{
	int c=100;
	public void display()
	{
		System.out.println("Child class a:"+super.a);
		System.out.println("Child class b:"+super.b);
		System.out.println("sub class c:"+c);
	}
}
public class Super {

	public static void main(String[] args) {
		Sub s=new Sub();
		s.display();
		// TODO Auto-generated method stub
	
	}

}
