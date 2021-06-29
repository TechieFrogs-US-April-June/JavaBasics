package com.ls;

import java.util.ArrayList;
import java.util.List;

public class Driver27 {

	public static void main(String[] args) {
		List<String>l1=new ArrayList<String>();
		List<String> uniqueList=new ArrayList<String>();
		l1.add("Gayatri");
		l1.add("Sowjanya");
		l1.add("Priyanka");
		l1.add("Sowjanya");
		l1.add("Priyanka");
		
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
