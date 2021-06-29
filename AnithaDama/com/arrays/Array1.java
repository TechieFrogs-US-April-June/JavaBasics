package com.arrays;

public class Array1 {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40};
		System.out.println(arr[1]);
		System.out.println(arr[3]);
		;
System.out.println( "array length : " +arr.length);
for(int i=0;i<arr.length;i++)      //array iteration
{
	System.out.println(arr[i]);
}
System.out.println("reverse order");
	
for(int i=arr.length-1;i>=0;i--)
	
{
	
	System.out.println(arr[i]);
}
	}

}
