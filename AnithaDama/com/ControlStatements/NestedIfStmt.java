package com.ControlStatements;

public class NestedIfStmt {
                                                            //when there is an if stmt inside another if stmt then it is called NestedIf
	public static void main(String[] args) {
		int num = 70;
		if(num>50)
		{
			System.out.println("num is graterthan 50");
			if(num<100)
			{
				System.out.println("num is lessthan 100");
			}
		}
			

	}

}
