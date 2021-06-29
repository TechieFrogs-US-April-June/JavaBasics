package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortDataComparator {

	public static void main(String[] args) {
		List<Emp1> l = new ArrayList<Emp1>();
		l.add(new Emp1(11,"C"));
		l.add(new Emp1(21,"B"));
		l.add(new Emp1(23,"D"));
		System.out.println("Sorting data based on eno");
		Collections.sort(l,new SortBasedOnEno());
		System.out.println(l);
		System.out.println("sorting data based on ename");
		Collections.sort(l,new SortBasedOnEname());
		System.out.println(l);

	}

}
