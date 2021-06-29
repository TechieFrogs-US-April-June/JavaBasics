package com.test.string;

public class StringLen {

	public static void main(String[] args) {
		String s =new String("aaaa");
	/*	{
			System.out.println(s.length());
		}*/
		//without using pre_defined length() method
		//----------------------------------------------------------
		char ch[] = s.toCharArray();
		int len =0;
		for(char t:ch)
		{
			len++;
		}
		System.out.println(len);

	}

}
