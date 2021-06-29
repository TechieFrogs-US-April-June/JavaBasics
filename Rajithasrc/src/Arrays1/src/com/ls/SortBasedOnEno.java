package com.ls;

import java.util.Comparator;

public class SortBasedOnEno implements Comparator<Emp17>
{

	@Override
	public int compare(Emp17 e1, Emp17 e2)
	{
		//e1-->represents current object
		//e2--->represents previos object
		if(e1.getEno() > e2.getEno())
			return 1;
		else if(e1.getEno() < e2.getEno())
			return -1;
		else
			return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
