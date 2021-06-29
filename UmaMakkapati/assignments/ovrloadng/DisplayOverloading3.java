package com.ovrloadng;

public class DisplayOverloading3 
{
	   public void disp(char c, int num)
	   {
	       System.out.println("I’m the first definition of method disp");
	   }
	   public void disp(int num, char c)
	   {
	       System.out.println("I’m the second definition of method disp" );
	   }
	}
