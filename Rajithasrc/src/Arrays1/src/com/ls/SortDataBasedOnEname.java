package com.ls;

import java.util.Comparator;

public class SortDataBasedOnEname  implements Comparator<Emp17>
{

	@Override
	public int compare(Emp17 e1, Emp17 e2)
	{
		return e1.getEname().compareTo(e2.getEname());
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
