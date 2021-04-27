package java.anitha.assignments;

import java.util.Scanner;

public class GCDofTwoNum {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number1 value:");
		int num1 = sc.nextInt();
		System.out.println("entee number2 value:");
		int num2 = sc.nextInt();
		//int num1 =80,num2=153;
		while(num1!=num2)
		{
			if(num1>num2)
			{
				num1=num1-num2;
			}
				else {
					num2=num2-num1;
			}
			
		}
		System.out.println("GCD of numbers is = " +num1 );
		sc.close();

	}

}
