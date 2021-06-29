package com.js;

import java.util.Arrays;

public class StringSample10 {

	static int MAX_CHAR=26;
	
	static boolean twoStrings(String s1,String s2)
	{
		boolean v[]=new boolean[MAX_CHAR];
		Arrays.fill(v, false);
		
		for(int i=0;i<s1.length();i++)
			v[s1.charAt(i)- 'a']=true;
		
		for(int i=0;i<s2.length();i++)
			if(v[s2.charAt(i)-'a'])
				return true;
		
		return false;
	}
	public static void main(String[] args) {
		
		String str1="hello";
		String str2="world";
		
		if(twoStrings(str1,str2))
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}
