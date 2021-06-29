package com.oops;

public class Prameterized1 {
	private int eno;
	public Prameterized1()
	{
		eno=10;
	}
	public Prameterized1(int no)
	{
		eno = no;
	}
	public int getValue()
	{
	//	System.out.println(eno);
		return eno;
	}

	public static void main(String[] args) {
		Prameterized1 p = new Prameterized1();
		Prameterized1 p2 = new Prameterized1(20);
		System.out.println(p.getValue());
		System.out.println(p2.getValue());

	}

}
