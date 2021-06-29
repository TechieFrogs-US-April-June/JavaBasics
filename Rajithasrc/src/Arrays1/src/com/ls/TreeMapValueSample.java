package com.ls;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapValueSample {

	public static void main(String[] args) {
		Map<String, Integer> m= new TreeMap<String,Integer>();
		m.put("B", 200);
		m.put("A",100);
		m.put("C", 300);
		Collection<Integer> st=m.values();
		Iterator<Integer> i=st.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
