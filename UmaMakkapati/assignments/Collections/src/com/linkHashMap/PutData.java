package com.linkHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class PutData {

	public static void main(String[] args) {
		
		Map<String,Integer> m = new LinkedHashMap<>();
		m.put("A", 10);//put() used to add entry to Map object
		m.put("B", 20);//First put() verify whether key exist or not
		m.put("C", 30);//if key exist then replace old-value with new-value
		for(Map.Entry<String,Integer> me:m.entrySet())
		{
			System.out.println(me.getKey()+"-"+me.getValue());
		}
		//System.out.println(m);
	
	}
}