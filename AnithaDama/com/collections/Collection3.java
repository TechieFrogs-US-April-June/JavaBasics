package com.collections;

import java.util.ArrayList;
import java.util.List;

//whether particular element is exist or not

public class Collection3 {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
		String name = "Devika";
		l1.add("priyanka");
		l1.add("pavani");
		l1.add("Devika");
		boolean flag = l1.contains(name);
		if(flag)
		{
			System.out.println("is exist");
			
		}
		else
		{
			System.out.println("not exist");
		}

	}

}
