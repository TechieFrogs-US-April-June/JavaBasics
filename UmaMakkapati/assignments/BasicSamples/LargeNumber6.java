package com.BasicSamples;

public class LargeNumber6 {

	public static void main(String[] args) {
		int i = 10;
		int j = 19;
		int k = 19;
		
		if(i>j && i>k)
			System.out.println("Large Number is i");
		else if(j>i && j>k)
			System.out.println("Large Number is j");
		else 
			System.out.println("Large Number is k");
	}

}
