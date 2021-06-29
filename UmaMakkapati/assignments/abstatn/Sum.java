package com.abstatn;

public abstract class Sum 
{
/* These two are abstract methods, the child class
 * must implement these methods
 */
public abstract int sumOfTwo(int n1, int n2);
public abstract int sumOfThree(int n1, int n2, int n3);
	
//Regular method 
public void disp(){
	System.out.println("Method of class Sum");
}
}