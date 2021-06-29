package com.ls;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		String s="welcome";
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
		for(Map.Entry<Character, Integer> me:m.entrySet())
		{
			if(me.getValue()==1)
			{
				System.out.println(me.getKey()+"-"+me.getValue());
				break;
			}
		}
	}

}
