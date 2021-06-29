package com.ls;

import java.util.HashMap;
import java.util.Map;

public class Driver75 {

	public static void main(String[] args) {
		Map<String,Integer> m=new HashMap<String,Integer>();
		String element="A";
		m.put("A",10);
		m.put("C",30);
		boolean flag = m.containsKey(element);
		if(flag)
		{
			System.out.println("element exist");
		}
		else
		{
			System.out.println("element does not exist");
		}
	}

}
