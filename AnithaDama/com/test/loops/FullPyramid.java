package com.test.loops;

public class FullPyramid {
	
	public static void main(String[] args) {
		for(int i = 1; i<=9; i++)
		{
			for(int j=9;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}

	}

}
