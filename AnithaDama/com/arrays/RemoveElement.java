package com.arrays;

public class RemoveElement {

	public static void main(String[] args) {
		int a[] = {10,20,30,40,50};
		int b[] = new int[a.length];
		
		int num=20;
		
	//	boolean flag =false;
		for(int i =0;i<=a.length-1;i++) {
		
			if(a[i]==num) {
				
				
			
			} else {
			
				b[i]=a[i];
			}			
		}
		
		for( int t:b) {
			
			System.out.println(t);
		}
	}
}
