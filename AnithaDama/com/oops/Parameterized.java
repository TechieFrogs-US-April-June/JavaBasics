package com.oops;

public class Parameterized {
	String ename;
	int eno;
	public Parameterized(String name,int no)
	{
		ename = name;
		eno = no;
	}
	void disp()
	{
		System.out.println(ename +" " + eno );
	}
	

	public static void main(String[] args) {
		Parameterized p = new Parameterized("abcd" , 20);
		Parameterized p1 = new Parameterized("fgri" , 30);
		p.disp();
		p1.disp();

	}

}
