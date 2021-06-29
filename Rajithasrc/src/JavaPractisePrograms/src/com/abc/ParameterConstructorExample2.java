package com.abc;

public class ParameterConstructorExample22 {

	private int var;
	
	public ParameterConstructorExample22(int num)///throw errow as there is no default constructor
	{
		var=num;
	}
	
	public int getValue()
	{
		return var;
	}
	public static void main(String[] args) {
		ParameterConstructorExample22 myobj=new ParameterConstructorExample22();
		System.out.println("value of var is: "+myobj.getValue());

	}

}
