package com.list;

import java.util.ArrayList;
import java.util.List;

public class ArrLisToArr {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("Nithya");
		l.add("Parthiv");
		l.add("Devika");
		String[] str = l.toArray(new String[l.size()]);
		for(String temp:str)
		{
			System.out.println(temp);
		}

	}

}
