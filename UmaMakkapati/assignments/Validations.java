package assignments;

import java.util.Scanner;

public class Validations {

	public static void main(String[] args) 
	{
		//validation to check hasNext() 
		/*String str1;// str2, str3;
		Scanner sc = new Scanner(System.in);
		//sc.useDelimiter("2");
		System.out.println("Take input from user:");
		str1 = sc.next();
		//System.out.println(sc.hasNext());
		System.out.println(sc.hasNextInt());
		
		//str2 = sc.next();
		//str3 = sc.next();
		System.out.println(sc.delimiter());
		System.out.println("My input value= " +str1);//" 2= "+str2+" 3= "+str3*/
		
		
		//to check hasNextint()
		int input =0;
		System.out.println("Enter an integer value ");
		Scanner sc = new Scanner(System.in);
		if(sc.hasNextInt()) 
		{
			input = sc.nextInt();
			if(input>0) 
		System.out.println("You entered positive integer:"+input);	
			else 
			{
				System.out.println("You entered negative integer"+input);
			}
		}else 
		{System.out.println("Please enter valid integer");
		}
		sc.close();
	}
	
	}

	
