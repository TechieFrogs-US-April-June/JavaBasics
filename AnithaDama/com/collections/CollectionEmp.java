package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionEmp {

	public static void main(String[] args) {
		List<Emp> l = new ArrayList<Emp>();
l.add(new Emp(1,"a"));
l.add(new Emp(2,"b"));
l.add(new Emp(3,"c"));
Iterator<Emp> i = l.iterator();
while(i.hasNext())
{
	Emp e = i.next();
	System.out.println(e.getEno() +" " +e.getEname());
}

	}

}
