package java.anitha.assignments;

import java.util.Scanner;

public class Delimiter {

	public static void main(String[] args) {
		Scanner sc = new Scanner("Java;program;practice; Delimetor");
		//sc.useDelimiter(";");
		System.out.println(" Delimetor is " +sc.delimiter());
		//sc.useRadix(16);
		System.out.println(" radix "  +sc.radix());
		while(sc.hasNext())
		{
			System.out.println(sc.next());
		}
sc.close();
	}

}
