package com.collections;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		List<String> uniqueList = new ArrayList<>();
		l1.add("Devika");
		l1.add("Nithya");
		l1.add("Navya");
		l1.add("Nithya");
		l1.add("Navya");
		for(String temp:l1)
		{
			if(!uniqueList.contains(temp))
			{
				uniqueList.add(temp);
			}
		}
		
System.out.println(uniqueList);
	}

}
