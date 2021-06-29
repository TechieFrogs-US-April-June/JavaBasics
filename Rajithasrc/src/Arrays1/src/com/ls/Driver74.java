package com.ls;

import java.util.HashMap;
import java.util.Map;

public class Driver74 {

	public static void main(String[] args) {
		Map<String,Integer> m=new HashMap<String,Integer>();
		m.put("A",10);
		m.put("C",30);
		Integer put = m.put("B",20);
	}

}
