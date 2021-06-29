package com.ControlStatements;

public class ContinueStmt1 {

	public static void main(String[] args) {
	int counter = 10;
	while(counter>=0)
	{
		if(counter==7)
		{
			counter--;
			continue;
		}
		System.out.println(counter +" ");
		counter--;
	}
	

	}

}
