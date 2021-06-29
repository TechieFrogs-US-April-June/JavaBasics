package com.ls;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver53 {

	public static void main(String[] args) {
		List<Emp16> lt=new ArrayList<Emp16>();
		lt.add(new Emp16(6,"B"));
		lt.add(new Emp16(5,"A"));
		lt.add(new Emp16(7,"C"));
		Collections.sort(lt);
		System.out.println(lt);

	}

}
