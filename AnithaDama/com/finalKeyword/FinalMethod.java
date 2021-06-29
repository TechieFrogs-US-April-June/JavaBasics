package com.finalKeyword;

public class FinalMethod {
	final void disp()
	{
		System.out.println("final method");
	}
}
class ABC extends FinalMethod
{
	/*void disp()
	{
		System.out.println("ABC method");
	}*/
	

	public static void main(String[] args) {
		FinalMethod obj1 = new FinalMethod();
		obj1.disp();

	}

}
