package com.ControlStatements;

public class SwitchCase {

	public static void main(String[] args) {
		int n1=10,n2=20,res = 0;
		switch('-')
		{
		case '+':
			res = n1+n2;
			break;
		case '-':
			res = n1-n2;
			break;
		case '*':
			res = n1*n2;
			break;
		default :
		System.out.println("enter wrong operator");
			
		}
		
System.out.println( res);
	}

}
