import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the first number ::  ");
        int a = scan.nextInt();
        System.out.println("enter the second number ::  ");
        int b = scan.nextInt();
        scan.close();
        int res = a + b;
        System.out.println("result is ::  " + res);         
    }
}
