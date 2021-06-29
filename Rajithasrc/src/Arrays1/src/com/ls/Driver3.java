package com.ls;

public class Driver3 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Emp3 e3= new Emp3();
		e3.disp();
		
		Class c=Class.forName("com.ls.Emp3");
		Emp3 emp3=(Emp3)c.newInstance();
		emp3.disp();

	}

}
