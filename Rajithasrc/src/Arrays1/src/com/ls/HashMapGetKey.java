package com.ls;

import java.util.HashMap;
import java.util.Map;

public class HashMapGetKey {

	public static void main(String[] args) {
		Map<String,Integer> m=new HashMap<String,Integer>();
		String ky="C";
		m.put("A",10);
		m.put("C",30);
		Integer value = m.get(ky);
		System.out.println(value);

	}

}
