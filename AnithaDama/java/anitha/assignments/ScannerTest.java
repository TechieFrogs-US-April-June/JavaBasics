package java.anitha.assignments;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name :");
		String name = sc.nextLine();
		
		System.out.println(" enter age : ");
		int age = sc.nextInt();
		System.out.println(" enter some value :");
		double value = sc.nextDouble();
		System.out.println(" enter mobile value :");
		long mobileno = sc.nextLong();
		System.out.println(" enter text  :" );
		String text = sc.next();
		
		char c = sc.next().charAt(0);
		System.out.println(" My name is " +name);
		System.out.println(" text is " +text);
		System.out.println("My age is " +age);
		System.out.println(" double value is " +value);
		System.out.println(" Mobile number is " +mobileno);
		System.out.println(" c =  " +c);
		sc.close();
		
		
	}

}
