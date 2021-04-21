import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter the first number :: ");
        int a = scan.nextInt();
        System.out.println(" Enter the second number :: ");
        int b = scan.nextInt();
        scan.close();
        System.out.println("Number before swapping are :: "  +a +"  and  "+b);
        int SWAP = a;
        a = b;
        System.out.println("Number after swapping are  :: "  +a +"  and  " +SWAP);
    }
}
