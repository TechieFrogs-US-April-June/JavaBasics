package com.abc;

class ABC{  
	   private double num = 100;
	   private int square(int a){
		return a*a;
	   }
	}  
	public class PrivateAccessModifierExample{
	   public static void main(String args[]){  
		ABC obj = new ABC();  
		System.out.println(obj.num); 
		System.out.println(obj.square(10));
	   }  
	}