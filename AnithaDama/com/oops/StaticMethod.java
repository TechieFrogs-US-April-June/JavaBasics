package com.oops;

public class StaticMethod {
	public static void copyArg(String str1,String str2)
	{
		str2 =str1;
		System.out.println("First string args is : " +str1);
		System.out.println("second string args is : " +str2);
	}

	public static void main(String[] args) {
		StaticMethod.copyArg("abc", "def");
		//copyArg("abc","def");

	}

}
