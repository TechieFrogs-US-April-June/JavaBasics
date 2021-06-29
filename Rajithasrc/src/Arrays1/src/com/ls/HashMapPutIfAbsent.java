package com.ls;

import java.util.HashMap;
import java.util.Map;

public class HashMapPutIfAbsent {

	public static void main(String[] args) {
		Map<String,Integer> m=new HashMap<String,Integer>();
		String ky="D";
		m.putIfAbsent("A",10);
		m.putIfAbsent("C",30);
		m.putIfAbsent("C",100);
		System.out.println(m);
	}

}
