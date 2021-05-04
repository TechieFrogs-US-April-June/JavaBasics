package src.Scanner;

import java.util.Scanner;

public class ScannarSkip {
    public static void main(String[] args) {
      String s = "Hello World! 3 + 3.0 = 6.0 true ";

      // create a new scanner with the specified String Object
      Scanner scanner = new Scanner(s);

      // skip the word "Hello"
      scanner.skip("Hello");

      // print a line of the scanner
      System.out.println("" + scanner.nextLine());

      // close the scanner
      scanner.close();



     String a = "Hello Welcome to Java Welcome";
        Scanner scan = new Scanner(a);
       scan.skip("Hello");
       System.out.println("" + scan.nextLine());
       scan.close(); 


    /*  Wrong Method
     System.out.println("Enter a String Value");
        Scanner s = new Scanner(System.in);
        String fullName = s.nextLine();
        s.skip(s.next());
        System.out.println(fullName);*/

       // scan.close(); 
       //s.close();

    }

}
