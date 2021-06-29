package com.BasicSamples;

public class AlphabetOrNot7 {

	public static void main(String[] args) {
		char ch = 'g';
		
		if(ch>= 65 && ch<= 90)
			System.out.println("It is Uppercase alphabet");
		
		else if(ch>=97 && ch<=122)
			System.out.println("It is Lowercase alphabet");
		
		else
			System.out.println("It is not an alphabet");
		
	}

}
