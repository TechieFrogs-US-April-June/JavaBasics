package com.basic.assignments;

import java.util.Scanner;

public class RightPascalTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of rows :");
		int rows = sc.nextInt();
		for(int i=1; i<=rows; i++)
		{
			for(int j = 1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
				
for(int i=rows; i>=1;i--)
{
	for(int j =1;j<=i;j++)
	{
		System.out.print("*");
	}
	System.out.println();
	sc.close();
}
	}

}
