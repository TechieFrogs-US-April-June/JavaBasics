package com.clasobj;

import java.util.Scanner;

class Average {
	
	int i, j, k;
	
	void aver1(int i, int j, int k)
	{
		this.i = i;
		this.j = j;
		this.k =k;
	}
		
	double aver()
	{
	double a1 = (i+j+k)/3;
	return a1;
	}
}
public class Average8{
	
	
	public static void main(String[] args) {
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter i: ");
		int i = sc2.nextInt();
		System.out.println("Enter j: ");
		int j = sc2.nextInt();
		System.out.println("Enter k: ");
		int k = sc2.nextInt();
		
		Average a8 = new Average();
		a8.aver1(i, j, k);
		System.out.print("Average of 3 nms: "+a8.aver());
		sc2.close();
		
	}

}
//Print the average of three numbers entered by user by creating a class named 
//'Average' having a method to calculate and print the average