package assignments;

import java.util.Scanner;

public class Validations2 {

	public static void main(String[] args) 
	{	
	/*	//To check skip()
		Scanner sc = new Scanner(System.in);
		System.out.println("Statement: ");
		sc.skip("check");
		System.out.println(sc.next());
		sc.close();*/
		
		// Declare the object and initialize with
        // predefined standard input object
        Scanner sc = new Scanner(System.in);
  
        // Taking input
        String name = sc.nextLine();
        char gender = sc.next().charAt(0);
        int age = sc.nextInt();
        String fatherName = sc.next();
        String motherName = sc.next();
  
        // Print the values to check
        // if the input was correctly obtained.
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Father's Name: "+ fatherName);
        System.out.println("Mother's Name: "+ motherName);
        sc.close();
	} 

}
