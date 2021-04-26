import java.util.Scanner;

public class ScannarSkip {
    public static void main(String[] args) {
      System.out.println("Enter a String Value");
        Scanner scan = new Scanner("Welcome to Java Welcome");
   //     String fullName = scan.next();
       scan.skip("Hello");

       System.out.println(scan.nextLine());
        

    /*  System.out.println("Enter a String Value");
        Scanner s = new Scanner(System.in);
        String fullName = s.nextLine();
        s.skip(s.next());
        System.out.println(fullName);*/

        scan.close();
       //s.close();

    }

}
