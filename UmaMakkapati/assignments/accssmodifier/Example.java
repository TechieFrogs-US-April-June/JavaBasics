package com.accssmodifier;

public class Example 
//This example throws compilation error because we are trying to access 
//the private data member and method of class ABC in the class Example. 
//The private data member and method are only accessible within the class.
		{
	   public static void main(String args[]){  
			ABC obj = new ABC();  
			System.out.println(obj.num); 
			System.out.println(obj.square(10));
		   }  
		}
