package com.ls;

import java.util.HashMap;
import java.util.Map;

public class Driver73 {

	public static void main(String[] args) {
		Map<String,String> m=new HashMap<String,String>();
		m.put("A","Hyd");
		m.put("C","Calcy");
		m.put("B","Bglr");
		m.put(null, null);
		m.put("F", null);
		for(Map.Entry me:m.entrySet())
		{
			System.out.println(me.getKey()+"-"+me.getValue());
		}
	}

}
