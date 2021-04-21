import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to find factorial :: ");
        int a = scan.nextInt();
        scan.close();
        int x = 1;
        int y = 1;
        while(y <= a)
        {
            x = x*y;
            y++;
        }
        System.out.println(x);
    }
}
