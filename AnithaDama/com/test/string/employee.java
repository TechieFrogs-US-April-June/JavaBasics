package com.test.string;

public class employee {

	int eno;
	String ename;
	employee()
	{
		eno=100;
		ename="aaaa";
	}
	public void disp()
	{
		System.out.println(eno +" " +ename);
	}
	 public String toString() {
	       return  eno + " " +ename;
	 }

	}


