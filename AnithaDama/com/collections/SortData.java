package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortData {

	public static void main(String[] args) {
	List<Emp> l = new ArrayList<Emp>();
	l.add(new Emp(1,"a"));
	l.add(new Emp(2,"d"));
	l.add(new Emp(3,"c"));
	
	Collections.sort(l);
	System.out.println(l);

	}

}