package com.abc;

public class StaticFinalExample {
	//static blank final variable  
	   static final int ROLL_NO;
	   static{ 
	      ROLL_NO=1230;
	   }  
	   public static void main(String args[]){  
	      System.out.println(StaticFinalExample.ROLL_NO);  
	   }  
	}
