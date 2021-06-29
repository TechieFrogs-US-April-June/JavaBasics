package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class ContainValue {

	public static void main(String[] args) {

		Map<String, Integer> ck = new HashMap<>();
		Integer i = 10;
		ck.put("A", 10);
		ck.put("B", 45);
		ck.put(null, null);
		ck.put(null, 20);
		boolean flag = ck.containsValue(i);
		if(flag)
		{
			System.out.println("Value exist");
		}
		else
		{
			System.out.println("Value doenot exist");
		}
	}

}
