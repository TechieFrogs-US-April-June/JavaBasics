package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class GetKee {

	public static void main(String[] args) {
		
		Map<String, Integer> ck = new HashMap<>();
		String k = "A";
		ck.put("A", 10);
		ck.put("B", 20);
		Integer i = ck.get(k);//get(key) checks whether key exist or not
		System.out.println(i);
		
	}

}
