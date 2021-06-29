package com.ls;

import java.util.HashMap;
import java.util.Map;

public class Driver83 {

	public static void main(String[] args) {
		Map<String,Integer> m=new HashMap<String,Integer>();
		m.put("A",10);
		m.put("C",30);
		m.replace("A",10,700);
		System.out.println(m);

	}

}
