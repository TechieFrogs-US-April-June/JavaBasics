import java.util.Scanner;

public class FindingLargest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st num  :: ");
        int a = scan.nextInt();
        System.out.println("Enter 2nd num  :: ");
        int b = scan.nextInt();
        System.out.println("Enter 3rd num  :: ");
        int c = scan.nextInt();
        scan.close();
        if (a>b && a>c) { System.out.println(a + "   is greatest number..!");}
        else if (b>a && b>c) { System.out.println(b + "   is greatest number..!");}
        else System.out.println(c + "   is greatest number..!");
    }
}
