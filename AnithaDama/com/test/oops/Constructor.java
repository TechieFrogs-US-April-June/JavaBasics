package com.test.oops;

public class Constructor {
	int a;
	int b;
	int c;
	Constructor()
	{
		System.out.println("default constructor");
	}
	//int a;
	//int b;
	Constructor( int a ,int b)
	{
this.a =a;
	this.b=b;
	}
	Constructor(int a ,int b, int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
/*	void display()
	{
		System.out.println(" a = " +a + " b= " +b );
		System.out.println("a = " +a + " b= " +b + " c= " +c);
	}*/


	public static void main(String[] args) {
		Constructor dc1 = new Constructor();
		Constructor dc = new Constructor(2,3);
		System.out.println(dc.a +" " +dc.b);
		Constructor dc2 = new Constructor(5,6,7);
		System.out.println(dc2.a + " " +dc2.b +" " +dc2.c);
		/*dc1.display();
		dc.display();
		dc2.display();*/
		
		
		
		
		

	}

}
