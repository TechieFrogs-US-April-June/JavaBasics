
//character based on index without using pre-defined method

package com.test.string;

public class BasedOnIndex {

	public static void main(String[] args) {
		String s = new String("Devika");
		char ch[] = s.toCharArray();
		int index = 1;
		for(int i =0;i<=ch.length;i++)
		{
			if(i==index)
			{
				System.out.println(ch[i]);
			}
		}
		
		char ch1 = s.charAt(1);
		
		System.out.println(ch1);
		
		

	

}
}
