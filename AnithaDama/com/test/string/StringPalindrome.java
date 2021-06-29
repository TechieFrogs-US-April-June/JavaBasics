package com.test.string;

public class StringPalindrome {

	public static void main(String[] args) {
		String s= new String("abccba");
		char ch[] = s.toCharArray();
		String rev = "";
		for(int i = ch.length-1;i>=0;i--)
		{
			rev= rev+ch[i];
		}
		if(s.equals(rev))
		{
			System.out.println("palindrome");
		}
		else
		{
		
			System.out.println("not palindrome");
		}

	}

	}
