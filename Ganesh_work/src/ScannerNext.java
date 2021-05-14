package java.anitha.assignments;

import java.util.Scanner;

public class ScannerNext {

	public static void main(String[] args) {
		String str = "it split the string into token";
		Scanner sc = new Scanner(str);
		while(sc.hasNext())
		{
			String tokens=sc.next();
			System.out.println(tokens);
			
					
		}
		
		sc.close();

	}

}