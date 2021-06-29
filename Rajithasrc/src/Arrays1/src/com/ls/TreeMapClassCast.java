package com.ls;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapClassCast {

	public static void main(String[] args) {
		Map m= new TreeMap();
		m.put("B",200);
		m.put("A",100);
		m.put("C",300);
		m.put(10, true);
		System.out.println(m.size());
		
	}

}
