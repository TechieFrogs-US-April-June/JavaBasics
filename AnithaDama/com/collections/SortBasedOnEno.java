package com.collections;

import java.util.Comparator;

public class SortBasedOnEno implements  Comparator<Emp1>{

	@Override
	public int compare(Emp1 e1, Emp1 e2) {
		if(e1.getEno()>e2.getEno())
			
		return 1;
		else if(e1.getEno()<e2.getEno())
			return -1;
		else
			return 0;
	}

	

}
