package com.ls;

import java.util.HashMap;
import java.util.Map;

public class HashMapGetOrDefault {

	public static void main(String[] args) {
		Map<String,Integer> m= new HashMap<String,Integer>();
		String ky="D";
		m.put("A", 10);
		m.put("C", 30);
		Integer value=m.getOrDefault(ky, 100);
		System.out.println(value);
	}

}
