/*5.	Java Program to Compare Strings using ==
 * 7.	Java Program to Compare String objects using ==
 * -----------------------------------------------------------------------------------------------------
 */
package com.test.string;

public class CompareString {

	public static void main(String[] args) {
	String s1="Welcome";
	String s2 = "Welcome";
	String s3 = new String("Welcome");
	String s4 = new String("Welcome");
	String s5 = s2;
	System.out.println(s1==s2);
	System.out.println(s2==s3);
	System.out.println(s3==s4);
	System.out.println(s2==s5);

	}

}
