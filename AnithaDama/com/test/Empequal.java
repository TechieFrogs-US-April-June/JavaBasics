package com.test;


public class Empequal {

	public static void main(String[] args) {
		Emp e1 = new Emp(20,"abc","comp");
		Emp e2 = new Emp(20,"abc","comp");
		boolean flag = e1.equals(e2);
		if(flag)
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not equal");
		}

	}

}
