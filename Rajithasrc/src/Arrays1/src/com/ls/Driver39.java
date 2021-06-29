package com.ls;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Driver39 {

	public static void main(String[] args) {
		List<String> al=new ArrayList<>();
		al.add("A");
		al.add("B");
		al.add("C");
		Iterator<String>i=al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
			al.add("D");
		}

	}

}
