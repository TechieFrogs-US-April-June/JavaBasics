package assignments;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		//int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Take output from user ");
		//a = sc.nextInt();//prints only integer values only
		
		String str1, str2;
		//str = sc.nextLine();//prints whole message
		str1 = sc.next();//take one word from sentence as token
		str2 = sc.next();
		System.out.println("First value is "+str1+" Second value is "+str2);
		System.out.println("Delimeter: "+sc.delimiter());
		sc.close();
		
		/*float b;
		b = sc.nextFloat();
		System.out.println("The float value is "+b);
		sc.close();*/
		
		/*short c;
		c = sc.nextShort();
		System.out.println("The short value is "+c);
		sc.close();*/
		
		/*long d;
		d = sc.nextLong();
		System.out.println("The long value is "+d);
		sc.close();*/
		

	}

}
