package com.oops;

public class CopyConstructor {             //copying the value of one object to another object
	String web;
	CopyConstructor(String w)
	{
		web = w;
	}
	CopyConstructor(CopyConstructor cc)
	{
		web= cc.web;
	}
	void disp()
	{
	System.out.println(" website: " +web);
	}
	public static void main(String[] args) {
		CopyConstructor obj1 = new CopyConstructor("google");
		CopyConstructor obj2 = new CopyConstructor(obj1);
obj1.disp();
obj2.disp();

	}

}
