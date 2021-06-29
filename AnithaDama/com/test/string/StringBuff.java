package com.test.string;

public class StringBuff {

	public static void main(String[] args) {
		/*String s = new String("abcde");
		StringBuffer sb = new StringBuffer("abcd");       
		boolean flag =s.contentEquals(sb);
		System.out.println(flag);*/
		String s1 = new String("Devika");
		StringBuffer sb = new StringBuffer(s1);               //convert string into StringBuffer
		
		System.out.println(sb);
		StringBuffer sb1 = new StringBuffer("Devika");   
		String str = sb1.toString();                      //convert stringBuffer into String
		System.out.println(str);
		
		//StringBuffer rev=sb1.reverse() ;    //reverse
		//sb1.reverse();
		//System.out.println(sb1);
		sb1.delete(3, 6);           //delete range of character
		System.out.println(sb1);
		
		//delete particular character
		
		StringBuffer sb2= new StringBuffer("abcde");
		sb2.deleteCharAt(4);
		System.out.println(sb2);
	}

}
