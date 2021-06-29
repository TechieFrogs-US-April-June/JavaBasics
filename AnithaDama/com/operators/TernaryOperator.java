package com.operators;

public class TernaryOperator {
//smallest number of three numbers
	public static void main(String[] args) {
		int a = 10,b=5,c=3,res,temp;
		 temp = (a<=b) ? a:b;
		 res = (c<=temp) ? c:temp;
		
System.out.println(res);
	}

}
