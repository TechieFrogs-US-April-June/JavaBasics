package com.ls;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccuranceOfEachCharacter {

	public static void main(String[] args) {
		String s="Welcome";
		char[] ch=s.toCharArray();
		Map<Character,Integer> m=new LinkedHashMap<>();
		for(char c:ch)
		{
			if(m.containsKey(c))
			{
				m.put(c, m.get(c)+1);
			}
			else
			{
				m.put(c, 1);
			}
		}
		for(Map.Entry me:m.entrySet())
		{
			System.out.println(me.getKey()+"-"+me.getValue());
		}
		
	}

}
