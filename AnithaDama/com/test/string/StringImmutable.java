package com.test.string;

public class StringImmutable {

	public static void main(String[] args) {
		String s1 = new String("Devika");
		String s2 = new String("Makkapati");
		s1.concat(s2);
		System.out.println(s1);
		System.out.println(s2);
	}

}
