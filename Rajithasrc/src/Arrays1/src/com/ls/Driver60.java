package com.ls;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Driver60 {

	public static void main(String[] args) {
		List<String> lst=new ArrayList<String>();
		lst.add("A");
		lst.add("B");
		
		lst.add("A");
		lst.add("B");	
		System.out.println(lst);
		Set<String> s=new HashSet<String>(lst);
		System.out.println(s);
		

	}

}
