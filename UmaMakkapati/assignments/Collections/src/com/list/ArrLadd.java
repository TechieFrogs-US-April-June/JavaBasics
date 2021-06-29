package com.list;

import java.util.ArrayList;
import java.util.List;

public class ArrLadd {

	public static void main(String[] args) {
		
	/*	List l = new ArrayList();
		l.add(1);
		l.add("Parthiv");
		l.add(true);
		l.add(null);
		l.add(true);
		System.out.println(l);*/
		
		List<String> l = new ArrayList<String>();
		l.add("Uma");
		l.add("Nithya");
		l.add("Parthiv");
		l.add("Devika");
		System.out.println(l);
		
		for(String temp:l)
		{
			System.out.println(temp);
		}
	}

}
