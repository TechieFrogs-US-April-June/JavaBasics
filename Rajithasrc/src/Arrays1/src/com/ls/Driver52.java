package com.ls;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver52 {

	public static void main(String[] args) {
		List<Emp15> lt=new ArrayList<Emp15>();
		lt.add(new Emp15(6,"B"));
		lt.add(new Emp15(5,"A"));
		lt.add(new Emp15(7,"C"));
		Collections.sort(lt);
		System.out.println(lt);

	}

}
