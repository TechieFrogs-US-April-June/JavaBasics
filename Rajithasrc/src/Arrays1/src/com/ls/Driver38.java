package com.ls;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Driver38 {

	public static void main(String[] args) {
		List<Emp10> al=new ArrayList<Emp10>();
		al.add(new Emp10(1,"A"));
		al.add(new Emp10(2,"D"));
		al.add(new Emp10(3,"C"));
		
		Iterator<Emp10>i= al.iterator();
		while(i.hasNext())
		{
			Emp10 e = i.next();
			System.out.println(e.getEno()+"-"+e.getEname());
		}
		

	}

}
