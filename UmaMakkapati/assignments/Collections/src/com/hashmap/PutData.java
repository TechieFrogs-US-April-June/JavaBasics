package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class PutData {

	public static void main(String[] args) {
		
		Map<String,Integer> m = new HashMap<>();
		m.put("A", 10);//put() used to add entry to Map object
		m.put("B", 20);//First put() verify whether key exist or not
		m.put("C", 30);//if key exist then replace old-value with new-value
		System.out.println(m);
		
	}

}
