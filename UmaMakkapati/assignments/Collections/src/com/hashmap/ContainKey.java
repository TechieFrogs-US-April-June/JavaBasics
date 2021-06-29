package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class ContainKey {

	public static void main(String[] args) {
		
		Map<String,Integer> ck = new HashMap<>();
		String k = "A";
		ck.put("A", 10);
		ck.put("B", 20);
		boolean flag = ck.containsKey(k);
		if(flag)
		{
			System.out.println("Key exist");
		}
		else
		{
			System.out.println("Key does not exist");
		}
		
	}

}
