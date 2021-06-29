package com.test.string;

public class ConvertString {

	public static void main(String[] args) {
		char ch[] = {'a','b', 'c','d'};              
		String s= new String(ch);            // convert char array into string
		System.out.println(s);

	
	// convert string to char array
//-----------------------------------------
	String s1= new String("abcde");
	char ch1[]  = s1.toCharArray();
	for(char t:ch1)
	{
		System.out.println(t);
	}
}
}