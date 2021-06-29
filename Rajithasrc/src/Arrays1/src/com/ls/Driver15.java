package com.ls;

public class Driver15 {

	public static void main(String[] args) {
		Policy p1=PolicySingleton.getInstance();
		Policy p2=PolicySingleton.getInstance();
		Policy p3=PolicySingleton.getInstance();
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());

	}

}
