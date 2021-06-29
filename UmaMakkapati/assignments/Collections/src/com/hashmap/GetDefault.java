package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class GetDefault {

	public static void main(String[] args) {
		
		Map<String, Integer> ck = new HashMap<>();
		String k = "D";
		ck.put("A", null);
		ck.put("B", null);
		ck.put("C", 10);
		ck.put("D", 40);
		Integer value = ck.getOrDefault(k, null);//getOrDefault(key,default-value) checks whether key exist or not
		System.out.println(value);//if key does not exist then return default-value to end-user
		
	}

}
