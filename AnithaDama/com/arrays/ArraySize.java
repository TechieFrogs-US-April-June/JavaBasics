package com.arrays;

public class ArraySize {

	public static void main(String[] args) {
		int a[] = {10,20,30,40};
		int length =0;
		for(int t:a)                               //without using pre_defined property
		{
			length++;
		}
		System.out.println(length);
	}

}
