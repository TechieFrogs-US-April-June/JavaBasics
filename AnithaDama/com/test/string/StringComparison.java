/*6.	Java Program to Compare Strings using equals()
-----------------------------------------------------------------------*/
package com.test.string;

public class StringComparison {

	public static void main(String[] args) {
		String s1="Developer";
		String s2 = "Developer";
		String s3=new String("tester");
		String s4="DEVELOPER";
		System.out.println(s1.equals(s4));
		System.out.println(s2.equals(s1));
		System.out.println(s3.equals(s1));
System.out.println(s4.equalsIgnoreCase(s2));
	}

}
