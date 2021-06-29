package com.arrays;

public class ExistOrNot {

	public static void main(String[] args) {
	int a[] = {10,20,30,40,50};
	//int num = 120;
	int num= 30;
	boolean flag = false;
	//	for(int i =0;i<a.length;i++)
	for(int i:a)
		{
			if(i ==num)//if(a[i]==num)
			{
				flag = true;
				break;
			}
		}
			if(flag)
			{
				System.out.println("num is exist");
			}
			else
			{
				System.out.println(" num does not exist ");
			}
		}
	}

	


