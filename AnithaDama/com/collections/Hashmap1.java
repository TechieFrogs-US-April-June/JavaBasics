package com.collections;

import java.util.HashMap;
import java.util.Map;

public class Hashmap1 {

	public static void main(String[] args) {
		Map<String,String> m = new HashMap<String,String>();
		m.put("D", "Devi");
		m.put(null, null);
		m.put("B", "nithya");
		m.put(null, "Navya");
		m.put("F", null);
		System.out.println(m);

	}

}
