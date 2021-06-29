/*Find out first occurrences of given character in string with using predefined method?
-----------------------------------------------------------------------------------------*/
package com.test.string;

public class IndexOf {

	public static void main(String[] args) {
		String s= new String("Devika");
		char c = 'D';
		int firstindexof = s.indexOf(c);
System.out.println(firstindexof);

//last occurrences of given character

char c1 = 'a';
int lastindexof = s.lastIndexOf(c1);
System.out.println(lastindexof);
	}

}
