package com.stackroute.program9;
 class Ocp 
{
	public void display()
	{
		System.out.println("Executed");
	}
}
public class Cast extends Ocp {
   public static void main(String[] args) {
      Cast c = new Cast();
      Ocp op = (Ocp)c;
      op.display();
   }
}