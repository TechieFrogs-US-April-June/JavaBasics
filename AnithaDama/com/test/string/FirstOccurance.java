package com.test.string;

public class FirstOccurance {

	public static void main(String[] args) {
		String s =new String("Devika");
		char ch[] = s.toCharArray();
		char c = 'D';
		for(int i=0;i<=ch.length;i++)
		{
			if(ch[i]==c)
			{
				System.out.println(i);
				break;
			}
			
		}

	}
	

}
