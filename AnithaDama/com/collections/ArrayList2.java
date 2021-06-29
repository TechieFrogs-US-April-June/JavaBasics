package com.collections;

import java.util.ArrayList;
import java.util.List;

//Convert ArrayList to Array

public class ArrayList2 {

	
	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
		l1.add("a");
		l1.add("b");
		l1.add("c");
		String[] str = l1.toArray(new String[l1.size()]);
		for(String temp:str)
		{
			System.out.println(temp);
		}

	}

}
