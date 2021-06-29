package com.arrays;

public class Array2 {

	public static void main(String[] args) {
		int a[] = {10,20,30,40};
		for(int t:a)                              // using enhanced for loop
		{                          //iterate array
System.out.println(t);
	}
System.out.println("even number ");
	
	int a1[] = {10,11,12,13,14};              
	
		
	for(int t:a1)
	{
		if(t%2==0)         //even number
		{
			System.out.println(t);
		}
	}
}
}
