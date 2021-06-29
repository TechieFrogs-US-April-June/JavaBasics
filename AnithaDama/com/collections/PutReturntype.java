package com.collections;

import java.util.HashMap;
import java.util.Map;

public class PutReturntype {

	public static void main(String[] args) {
		Map<String,Integer> m = new HashMap<>();
		m.put("A", 2);
		m.put("B", 3);
		Integer put = m.put("C", 4);
		

	}

}
