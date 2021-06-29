package com.collections;

import java.util.HashMap;
import java.util.Map;

public class Replacevalue {

	public static void main(String[] args) {
		Map<String,Integer> m = new HashMap<>();
		Integer element = 20;
		m.put("A", 10);
		m.put("B", 20);
		//m.replace("C", 30);
	//m.replace("A", 10, 40);
		m.remove("C");
		
		System.out.println(m);

	}

}
