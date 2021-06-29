package com.ls;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver51 {

	public static void main(String[] args) {
		List<Emp11> lt=new ArrayList<Emp11>();
		lt.add(new Emp11(6,"B"));
		lt.add(new Emp11(5,"A"));
		lt.add(new Emp11(7,"C"));
		Collections.sort(lt);
		System.out.println(lt);
	}

}
