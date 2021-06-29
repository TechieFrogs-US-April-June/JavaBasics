package com.ls;

import java.util.HashMap;
import java.util.Map;

public class Driver76 {

	public static void main(String[] args) {
		Map<String,Integer> m=new HashMap<String,Integer>();
		Integer element=30;
		m.put("A",10);
		m.put("C",30);
		boolean flag = m.containsValue(element);
		if(flag)
		{
			System.out.println("value exist");
		}
		else
		{
			System.out.println("value does not exist");
		}

	}

}
