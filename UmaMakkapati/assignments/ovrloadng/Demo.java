package com.ovrloadng;

public class Demo {

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
		Demo obj = new Demo();
		/* I am passing float value as a second argument but
		 * it got promoted to the type double, because there
		 * wasn't any method having arg list as (int, float)
		 */
		obj.disp(100, 20.67f);
	   }
	}
