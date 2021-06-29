package com.ls;

import java.util.HashMap;
import java.util.Map;

public class Driver80 {

	public static void main(String[] args) {
		Map<String,Integer> m=new HashMap<String,Integer>();
		Integer element=30;
		m.put("A",10);
		m.put("C",30);
		m.remove("A",10);
		System.out.println(m);
	}

}
