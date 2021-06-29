/* Create a class named 'PrintNumber' to print various numbers of different datatypes by creating different methods with the same name 'printn' 
 * having a parameter for each datatype
 * 
 -----------------------------------------------------------------------------------------------------------------------------------------*/

package com.test.methods.old;

public class PrintNumber {
	public static void printn(int x,int y) {
		System.out.println(x*y);
	}
	public static void printn(int x) {
		System.out.println(x*x);
	}
public static void printn(int x,double y)
{
	System.out.println(x+y);
}
public static void printn(int x,float y)
{
	System.out.println(x+y);
}
	public static void main(String[] args) {
		printn(2,3);
		printn(2,2.5);
		printn(3,5.26);
		printn(3);
		
		

	}
	
		
	}


