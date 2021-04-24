import java.util.Scanner;

public class ScannerCondition {
    
    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
        int Number = sc.nextInt();
        if (Number % 2 == 0)
        {
            System.out.println("Even Number");
        }
        else
            {
                System.out.println("Odd Number");
            }
        }
        else {
            System.out.println("Enter a valid Number");
        }
            sc.close();
    }
}
