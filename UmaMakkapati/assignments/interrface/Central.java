package com.interrface;

public class Central implements A,B
//A class cannot implement two interfaces that have methods with same name but different return type.
{


	   public void aaa() // error
	   {
	   }
	   public int aaa() // error
	   {
	   }
	   public static void main(String args[])
	   {

	   }
	
}