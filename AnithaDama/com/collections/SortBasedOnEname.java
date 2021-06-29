package com.collections;

import java.util.Comparator;

public class SortBasedOnEname implements Comparator<Emp1> {

	@Override
	public int compare(Emp1 e1, Emp1 e2) {
		
		return e1.getEname().compareTo(e2.getEname());
	}

}
