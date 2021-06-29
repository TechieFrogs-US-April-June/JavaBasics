package com.variables;

public class LocalVarEx {
//String name = "abcd";//instance variable
public void disp()
{
	String name = "def";//local variable
	System.out.println(name);
}

	public static void main(String[] args) {
		LocalVarEx l = new LocalVarEx();
		System.out.println("calling method");
		l.disp();
	//	System.out.println(l.name);

	}

}
