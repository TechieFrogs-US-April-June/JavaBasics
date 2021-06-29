package com.ls;

import java.util.HashMap;
import java.util.Map;

public class HashMapPut {

	public static void main(String[] args) {
		Map<String,Integer> m=new HashMap<String,Integer>();
		m.put("A",10);
		m.put("C",30);
		m.put("C",100);
		System.out.println(m);
	}

}
