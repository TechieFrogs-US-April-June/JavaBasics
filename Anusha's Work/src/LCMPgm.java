import java.util.Scanner;

public class LCMPgm {
    public static void main(String[] args) {
        int max, lcm = 0, temp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value:");
        int num1 = sc.nextInt();
        System.out.println("Enter b value:");
        int num2 = sc.nextInt();
        if (num1 == 0 && num2 == 0)
            return;
        if (num1 > num2) {
            max =temp= num1;
        } else {
            max = temp=num2;
        }
        while (num1 != 0) {
            if (max % num1 == 0 && max % num2 == 0) {
                lcm = max;
                break;
            }
            max = max + temp;
        }
        System.out.println("LCM of given numbers is"+lcm);

    }
            
}