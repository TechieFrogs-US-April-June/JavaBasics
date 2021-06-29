package com.test.loops;

public class Sumofnaturalnum {

	public static void main(String[] args) {
		int num = 8;
		int sum = 0;
		//for loop
		/*for(int i = 1; i<=num; i++ )
		{
			sum  =  sum+i;
		}*/
		int i = 1;
		//while loop
		while(i<=num)
		{
			sum = sum+i;
			i++;
		}

System.out.println("sum of  " + num + " is "  + sum);
	}

}
