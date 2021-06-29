package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class PutIfAbsnt {

	public static void main(String[] args) {
		
		Map<String,Integer> ck = new HashMap<>();
		ck.putIfAbsent("A", 10);
		ck.putIfAbsent("B", 40);
		ck.putIfAbsent("c", 100);
		System.out.println(ck);
	}

}
