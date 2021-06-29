package com.test.string;

public class LastOccurance {

	public static void main(String[] args) {
		String s =new String("Devika");
		char ch[] = s.toCharArray();
		char c ='a';
		int temp = 0;
		for(int i =0;i<=ch.length-1;i++)
		{
			if(ch[i] == c)
			{
				temp =i;
			}
		}
		System.out.println(temp);
		}

	}


