package xyzpackage;

import abcpackage.Addition;

public class Test
		{
	   public static void main(String args[]){
			Addition obj = new Addition();
		        /* It will throw error because we are trying to access
		         * the default method in another package
		         */
			obj.addTwoNumbers(10, 21);
		   }
		}