package com.ls;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccuranceOfEachWord {

	public static void main(String[] args) {
		String originalString="welcome to java java is programming language";
		String[] words=originalString.split(" ");
		Map<String,Integer> m=new LinkedHashMap<>();
		for(String temp: words)
		{
			if(m.containsKey(temp))
			{
				m.put(temp, m.get(temp)+1);
			}
			else
			{
				m.put(temp, 1);
			}
		}
		for(Map.Entry<String, Integer> me: m.entrySet())
		{
			System.out.println(me.getKey()+"-"+me.getValue());
		}
	}

}
