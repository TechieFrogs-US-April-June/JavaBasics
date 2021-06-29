package com.ls;

import java.util.LinkedHashMap;
import java.util.Map;

public class MostRepeatedCharacter {

	public static void main(String[] args) {
		String s="madammadam";
		char[] ch = s.toCharArray();
		Map<Character,Integer> m=new LinkedHashMap<>();
		for(char c:ch)
		{
			if(m.containsKey(c))
			{
				m.put(c,m.get(c)+1);
			}
			else
			{
				m.put(c,1);
			}
		}
		Character ky=' ';
		Integer vl=0;
		for(Map.Entry<Character, Integer> me: m.entrySet())
		{
			if(me.getValue()>vl)
			{
				ky=me.getKey();
				vl=me.getValue();
			}
			}
		System.out.println(ky+" "+vl);
		}
	}


