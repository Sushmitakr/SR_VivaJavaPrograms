package com.stackroute.programs;


public class Test {
	
	private String name;  
	   
	public String getName(){  
	return name;  
	}  
	public void setName(String name){  
	this.name=name;
	}  

	public static void main(String[] args) {
		Student s=new Student();  
		s.setName("vijay");  
		System.out.println(s.getName()); 

	}

}
