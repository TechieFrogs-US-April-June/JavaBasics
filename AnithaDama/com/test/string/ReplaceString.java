package com.test.string;

public class ReplaceString {

	public static void main(String[] args) {
		String s = new String("ANITHA");
		char ch[]=s.toCharArray();
		String temp = "";
		int l=0;
		char c = 'A';
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i] == c)
			{
				temp = temp+  ++l;
				
			}
			else
			{
				temp = temp+ch[i];
			}
		}
		System.out.println(temp);
		

	}

}
  