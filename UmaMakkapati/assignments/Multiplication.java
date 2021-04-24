package assignments;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) 
	{
	/*	int a = 5;
		int c;
				
		for(int b = 1; b<=10; b++)
		{ 	
		c = a*b;					
		System.out.println(a+"*"+b+"="+c);
		}
	*/
		int i, j, mul;
		Scanner sc = new Scanner(System.in);
		System.out.println("Multiplication of: ");
		i = sc.nextInt();
		System.out.println("number: ");
		j = sc.nextInt();
		sc.close();
		mul = i*j;
		System.out.println("Table of: "+mul);
		
	}
}
