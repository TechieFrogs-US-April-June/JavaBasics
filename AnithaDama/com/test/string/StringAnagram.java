package com.test.string;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		String s1 = "State";
		String s2 = "Taste";
		s1.toLowerCase();
		s2.toLowerCase();
		if(s1.length()==s2.length())
		
		{
			char ch1[] = s1.toCharArray();
			char ch2[] = s2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
		
		//	boolean result = Arrays.equals(ch1, ch2);
			if(Arrays.equals(ch1, ch2))
			{
				System.out.println(s1 +" and " +s2 + " are anagaram ");
			}
			
			
			else {
				System.out.println(s1 +" and " +s2 + " are  not anagaram ");
		}
	}
		
		
}
	
}

