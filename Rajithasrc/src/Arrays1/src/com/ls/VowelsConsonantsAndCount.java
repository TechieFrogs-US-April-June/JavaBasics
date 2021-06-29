package com.ls;

import java.util.ArrayList;
import java.util.List;

public class VowelsConsonantsAndCount {

	public static void main(String[] args) {
		String originalString="programming";
		int vwCount=0;
		int consonantsCount=0;
		List<Character> vowels=new ArrayList<>();
		List<Character> consonants=new ArrayList<>();
		char[] ch=originalString.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' ||ch[i]=='o' ||ch[i]=='u')
			{
				vwCount++;
				vowels.add(ch[i]);
			}
			else
			{
				consonantsCount++;
				consonants.add(ch[i]);
			}
		}
		System.out.println("VowelsCunt--->"+vwCount);
		System.out.println("vowels-->"+vowels);
		
		System.out.println("consonantsCount--->"+consonantsCount);
		System.out.println("consonants--->"+consonants);
		}
		

	}


