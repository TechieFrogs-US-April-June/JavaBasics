package com.collections;

import java.util.HashMap;
import java.util.Map;

public class GetKeyValue2 {

	public static void main(String[] args) {
		Map<String,String> m = new HashMap<>();
		m.put("A", "abc");
		m.put("B", "def");
		m.put("C", "Devi");
		m.put(null, null);
		m.put("F", null);
		for(Map.Entry me:m.entrySet())
		{
			System.out.println(me.getKey() +" " + me.getValue());
		}

	}

}
