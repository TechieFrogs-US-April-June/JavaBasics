package com.ls;

import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapPutIfAbsentEntrySet {

	public static void main(String[] args) {
		Map<String,Integer> m=new LinkedHashMap();
		m.putIfAbsent("A",10);
		m.putIfAbsent("C",30);
		m.putIfAbsent("C",100);
		for(Map.Entry<String,Integer> me:m.entrySet())
		{
			System.out.println(me.getKey()+"-"+me.getValue());
		}
	    	
	}

}
