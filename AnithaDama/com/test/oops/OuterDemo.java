package com.test.oops;

public class OuterDemo {
	int a;
	static int b;
	private int c;

	protected class  InnerDemo
	
	{
		int num;
		private int z=5;
	
		
			
		
	
	private void display()
	{
		
		System .out.println("inner class values "  +  num  + " value a  " + a + " value b " + b + " value c " +c);
	}
	}
/*	void displayInnerDemo()
	{
		InnerDemo innerclassobj = new InnerDemo();
		innerclassobj.display();
	}*/
	

	public static void main(String[] args) {
		
		OuterDemo outerobj = new OuterDemo();
		outerobj.a = 10;
		outerobj.c=20;
		OuterDemo.InnerDemo innerobj =  outerobj.new InnerDemo();
		innerobj.num=20;
		innerobj.display();
		//outerobj.displayInnerDemo();
		
		

	}

}
