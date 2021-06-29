package com.test.loops;

import java.util.Scanner;

public class Solution {
	public static int computeSum(int inputNum)
	{
		int answer=0;
		for(int i=1;i<=inputNum;i++)
		{
			answer = (inputNum*(inputNum+1))/2;
			
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("enter inputNum");
		int inputNum = in.nextInt();
		try {
			int result = computeSum(inputNum);
			System.out.println(result);
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		in.close();

	}

}
