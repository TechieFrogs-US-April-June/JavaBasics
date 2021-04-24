import java.util.Scanner;

public class FindingLargest {
        static int a,b,c;
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st num  :: ");
        if(scan.hasNextInt()){
            a = scan.nextInt();}
       else {System.out.println("Please enter INTEGER value");System.exit(1);}

        System.out.println("Enter 2nd num  :: ");
        if(scan.hasNextInt()){
           a = scan.nextInt();}
        else {System.out.println("Please enter INTEGER value");System.exit(1);}

       System.out.println("Enter 3rd num  :: ");
       if(scan.hasNextInt()){
          a = scan.nextInt();}
       else {System.out.println("Please enter INTEGER value");System.exit(1);}

        scan.close();
        
        if (a>b && a>c) { System.out.println(a + "   is greatest number..!");}
        else if (b>a && b>c) { System.out.println(b + "   is greatest number..!");}
        else System.out.println(c + "   is greatest number..!");
    }
}
