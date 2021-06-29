package com.arrays;

public class EvenSum {

	public static void main(String[] args) {
		int a[] = {10,11,12,13,14};
		int evensum=0;
		for(int t:a)
		{
			if(t%2==0)
				
			{
				evensum=evensum+t;
			}
			
		}
		System.out.println(evensum);
	}

}
