package com.ls;

public class StringSample26 {

	public static void main(String[] args) {
		String s="I am A Java Deveoper 4544353";
		char ch[]=s.toCharArray();
		int vowels=0,consonants=0,numbers=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
			{
				vowels++;
			}
			else if((ch[i]>='a'&& ch[i]<='z')||(ch[i]>='A'&& ch[i]<='Z'))
			{
				consonants++;
			}
			else if(ch[i]>='0'&& ch[i]<='9')
			{
				numbers++;
			}
		}
       System.out.println("Number of vowels in a given String: "+vowels);
       System.out.println("Number of consonants in a given String: "+consonants);
       System.out.println("Numbers in a given String: "+numbers);
	}

}
