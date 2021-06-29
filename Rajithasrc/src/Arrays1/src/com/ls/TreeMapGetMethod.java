package com.ls;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapGetMethod {

	public static void main(String[] args) {
Map<String,Integer> m=new TreeMap<String,Integer>();
		
		m.put("B",200);
		m.put("A",100);
		m.put("C",300);
		Integer value=m.get("B");
		System.out.println(value);
	}

}
