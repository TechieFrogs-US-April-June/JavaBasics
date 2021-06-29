package com.ls;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapReadonly {

	public static void main(String[] args) {
		Map<String,Integer> m= new TreeMap<String,Integer>();
		m.put("B",200);
		m.put("A",100);
		m.put("C",300);
		Map<String,Integer> unmodifiableMap=Collections.unmodifiableMap(m);
		unmodifiableMap.put("D", 400);
		System.out.println(unmodifiableMap);
	}

}
