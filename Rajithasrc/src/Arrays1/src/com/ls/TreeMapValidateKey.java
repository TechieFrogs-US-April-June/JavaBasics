package com.ls;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapValidateKey {

	public static void main(String[] args) {
	Map<String, Integer> m= new TreeMap<String,Integer>();
	String ky="c";
	m.put("B",200);
	m.put("A",100);
	m.put("C",300);
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
	

	


