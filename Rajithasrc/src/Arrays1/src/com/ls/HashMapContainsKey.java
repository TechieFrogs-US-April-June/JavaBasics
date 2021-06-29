package com.ls;

import java.util.HashMap;
import java.util.Map;

public class HashMapContainsKey {

	public static void main(String[] args) {
		Map<String,Integer> m=new HashMap<String,Integer>();
		String ky="A";
		m.put("A",10);
		m.put("C",30);
		boolean flag = m.containsKey(ky);
		if(flag)
		{
			System.out.println("key exist");
		}
		else
		{
			System.out.println("key does not exist");
		}
	}

}
