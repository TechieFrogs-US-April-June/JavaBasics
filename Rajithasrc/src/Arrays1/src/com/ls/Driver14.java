package com.ls;

public class Driver14 {

	public static void main(String[] args) {
		Emp14 e1=new Emp14(100,"A","Release");
		Emp14 e2=new Emp14(100,"A","Release");  
		boolean flag = e1.equals(e2);
		if(flag)
		{
			System.out.println("2 objects are equal");
		}
		else
		{
			System.out.println("2 objects are not equal");
		}

}
}
