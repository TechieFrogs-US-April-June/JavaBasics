package com.ls;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapSample {

	public static void main(String[] args) {
	Map<String,Integer> m=new TreeMap<String,Integer>();
	m.put("B", 200);
	m.put("A", 100);
	m.put("C", 300);
	//System.out.println(m.size());
	for(Map.Entry<String, Integer> me: m.entrySet())
	{
		System.out.println(me.getKey()+"-"+me.getValue());
		
	}	
	}
	

}
