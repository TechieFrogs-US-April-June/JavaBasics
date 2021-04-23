package assignments;

import java.util.Scanner;

public class ScsnnerDelimeter {

	public static void main(String[] args) 
	{
		String a = "Hello World";
		Scanner sc = new Scanner(a);
		sc.delimiter();//\\s*fish\\s*
		
		System.out.println(sc.nextInt());
		//System.out.println(sc.nextInt());
		//System.out.println(sc.next());
		//System.out.println(sc.next());
		
		sc.close();
	}

}
