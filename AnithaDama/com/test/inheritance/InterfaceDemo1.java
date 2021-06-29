package com.test.inheritance;
interface Myinterface{
	int i=10;//public static final int i=10;
	void display();//public abstract void display();
	void showMsg();
	
}
interface NewInterface
{
	int i= 20;
	void  newdisplay();
	
}
interface MultiInterface{

	void multidisplay();
			
}
interface Interface1 extends NewInterface,MultiInterface
{
	int i=30;
	void display();
	static void othermethod()
	{
		System.out.println("static other method");	
		}
}
abstract class MyAbstractclass1 implements Myinterface//abstract class can impliment interface.
{
	abstract void myDisplay();
	public void display() {
		System.out.println("in display");
	}

}
public   class InterfaceDemo1 extends MyAbstractclass1 implements  NewInterface,Interface1 {
	void myDisplay() {
		
	}
	public void showMsg() {
		
	}

	/*public void display() {
		System.out.println("In display");
		
	}
	public void showMsg() {
		System.out.println("In showmsg");
	}*/

	public static void main(String[] args) {
		InterfaceDemo1 obj1 = new InterfaceDemo1();
		System.out.println(NewInterface.i);
	//obj1.display();
obj1.newdisplay();
	}
	@Override
	public void multidisplay() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void newdisplay() {
		// TODO Auto-generated method stub
		
	}

}
