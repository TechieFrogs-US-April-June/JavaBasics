package com.basic.assignments;

public class AlphabetOrNot {

	public static void main(String[] args) {
		char ch = '&';
		//char ch = 'b';
		if((ch >='a' && ch >='z') || (ch>='A' && ch >='Z'))
		{
			System.out.println(ch + " is a alphabet");
		}
		else {
			System.out.println(ch +  " is not alphabet");
		}
		
	}

}
