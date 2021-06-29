/*Create a class to print an integer and a character with two methods having the same name but different sequence of the integer and the character parameters.
For example, if the parameters of the first method are of the form (int n, char c), then that of the second method will be of the form (char c, int n).
--------------------------------------------------------------------------------------------------------------------------------------------*/

package com.test.methods.old;

public class PrintIntChar {
	void print(int n,String c)
	{
		System.out.println( n + "  " + c);
	}
	void print(String c,int n)
	{
	System.out.println(c +  "   " +n);
	}
	

	public static void main(String[] args) {
		PrintIntChar obj1 = new PrintIntChar();
		obj1.print(10, "java");
		obj1.print("oops",11 );
				
		

	}
	
		
	}


