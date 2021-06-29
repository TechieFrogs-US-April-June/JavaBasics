package com.controlStat;

public class ContinueExample2 {

	public static void main(String args[])
	{
		int counter=10;
		while (counter >=0)
		{
	           if (counter==7)
	           {
		       counter--;
		       continue;
	           }
	           System.out.print(counter+" ");
	           counter--;
		}
	   }
	}
