package com.ls;

import java.util.ArrayList;
import java.util.List;

public class Driver36 {

	public static void main(String[] args) {
		List<String> al=new ArrayList<>();
		al.add("A");
		al.add("B");
		al.add("C");
		String[] s=al.toArray(new String[al.size()]);
		for(String temp:s)
		{
			System.out.println(temp);
		}
	}

}
