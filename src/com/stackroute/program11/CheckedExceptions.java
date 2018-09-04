package com.stackroute.program11;

import java.io.*;
public class CheckedExceptions {

	public static void main(String[] args) 
	{
		FileInputStream fis=null;
		try
		{
			fis=new FileInputStream("");
			
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File Not Found");
		}
		int r;
		try
		{
		while((r = fis.read() ) != -1)
		{
			System.out.print((char)r);
		}
		fis.close();
		}
		catch (IOException ioe)
		{
			System.out.println(ioe);
		}
	}

}
