package com.ls;

public class StringSample25 {

	public static void main(String[] args) {
		String s="welcome";
		char ch[]=s.toCharArray();
		for(int a=0;a<ch.length;a++)
		{
			if(ch[a]>='a'&&ch[a]<='z')
			{
				ch[a]=(char)((int)ch[a]-32);
			}
			
			System.out.print(ch[a]);
		}

	}

}
