package com.xyzpackage;
import com.abcpackage.*;
public class Test  {
	public static void main(String args[]){
		//Addition obj = new Addition();
	        /* It will throw error because we are trying to access
	         * the default method in another package
	         */
		//obj.addTwoNumbers(10, 21);
		
		//Test obj=new Test();
		//System.out.println(obj.addTwoNumbers(11,22));
		
		Addition obj=new Addition();
		System.out.println(obj.addTwoNumbers(100,1));
	   }
	}