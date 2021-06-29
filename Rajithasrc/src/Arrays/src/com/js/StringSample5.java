package com.js;
// anagram 
public class StringSample5 {

	public static void main(String[] args) {
		String s1=new String("Listen");
		String s2=new String("Silent");
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		for (int i=0;i<ch1.length;i++)
		{
			for (int j=0;j<ch2.length;j++) {
				if(ch1[i]==ch2[j])//
				{
					System.out.println("Both Strings are anagram");
				}
				else {
					System.out.println("Both Strings are not anagram");
				}
			}
		}
			

	}

}
