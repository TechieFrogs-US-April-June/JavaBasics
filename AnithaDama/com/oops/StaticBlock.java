package com.oops;

public class StaticBlock {
	static int no;
	static String name;
	static
	{
		System.out.println("static block1");
		no=90;
		name= "Devika";
	}
	static
	{
		System.out.println("static block2");
		no=80;
		name= "Nithya";
	}

	public static void main(String[] args) {
		System.out.println(no);
		System.out.println(name);

	}

}
