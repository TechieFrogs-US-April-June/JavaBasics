package com.test.loops;

public class InvertedFullPyramidStar {

	public static void main(String[] args) {
		for(int i=9; i>=1; i--)
		{
			for(int j=8;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				
		
		System.out.print(" *");
		
	}
			System.out.println();
		}
}
}