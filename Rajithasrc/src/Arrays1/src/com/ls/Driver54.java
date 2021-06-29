package com.ls;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver54 {

	public static void main(String[] args) {
		List<Emp17> lt=new ArrayList<Emp17>();
		lt.add(new Emp17(6,"B"));
		lt.add(new Emp17(5,"A"));
		lt.add(new Emp17(7,"C"));
		
		System.out.println("**********Sorting data based on eno**********");
		Collections.sort(lt,new SortBasedOnEno());
		System.out.println(lt);
		
		System.out.println("**********Sorting data based on ename**********");
		
		Collections.sort(lt,new SortDataBasedOnEname());
		System.out.println(lt);

	}

}
