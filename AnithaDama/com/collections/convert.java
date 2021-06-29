package com.collections;

import java.util.ArrayList;
import java.util.List;

public class convert {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		l1.add("abc");
		l1.add("def");
		String[] str = l1.toArray(new String[l1.size()]);
		for(String temp:str)
		{
			System.out.println(temp);
		}
		

	}

}
