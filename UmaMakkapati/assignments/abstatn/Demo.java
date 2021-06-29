package com.abstatn;

public class Demo extends AbstractDemo
{

	   public void anotherMethod() { 
	        System.out.print("Abstract method"); 
	   }
	   public static void main(String args[])
	   { 
	      //error: You can't create object of it
	      AbstractDemo obj = new AbstractDemo();
	      obj.anotherMethod();
	   }
	}
