package com.listsamples;

import java.util.ArrayList;
import java.util.List;

public class RemovingDuplicatesFromArrayList {

	public static void main(String[] args) {
		List<String> l1=new ArrayList<String>();
		List<String> uniqueList = new ArrayList<String>();
		l1.add("Book");
		l1.add("Book");
		l1.add("Pen");
		l1.add("Pencil");
		l1.add("Pen");
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
