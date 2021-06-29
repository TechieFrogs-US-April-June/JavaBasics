package com.ls;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapIterator {

	public static void main(String[] args) {
		Map<String,String> m1=new HashMap<String,String>();
		m1.put("ABC","Chennai");
		m1.put("EDF","Banglore");
		m1.put("HJK","Hyderabad");
		Set<String> keySet = m1.keySet();
		Iterator<String> i= keySet.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		

	}

}
