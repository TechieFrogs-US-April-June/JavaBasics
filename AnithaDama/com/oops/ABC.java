package com.oops;

public class ABC {
	public void disp()
	{
		System.out.println("Parent class method called");
		
	}

}
class Demo extends ABC{
public void disp()
{
	super.disp();//this will call disp() of parent class
	System.out.println("child class method called");
}
/*public void newMethod()
{
	System.out.println("child class new method called");
}*/

}