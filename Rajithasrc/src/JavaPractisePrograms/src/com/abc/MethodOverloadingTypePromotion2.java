package com.abc;

public class MethodOverloadingTypePromotion2 {

	void disp(int a, double b){
		System.out.println("Method A");
	   }
	   void disp(int a, double b, double c){
		System.out.println("Method B");
	   }
	   void disp(int a, float b){
		System.out.println("Method C");
	   }
	   public static void main(String args[]){
		   MethodOverloadingTypePromotion2 obj = new MethodOverloadingTypePromotion2();
		/* This time promotion won't happen as there is
		 * a method with arg list as (int, float)
		 */
		obj.disp(100, 20.67f);
	   }
	}