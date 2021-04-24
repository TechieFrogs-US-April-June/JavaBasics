import java.util.Scanner;

public class ScannarSkip {
    public static void main(String[] args) {
        Scanner scan = new Scanner("Hello world");
        scan.skip("Hello ");

        System.out.println(scan.nextLine());
        

      /* System.out.println("Enter a String Value");
        Scanner s = new Scanner(System.in);
        String fullName = s.nextLine();
        s.skip(s.nextLine());
        System.out.println(fullName);*/

        scan.close();
       // s.close();

    }

}
