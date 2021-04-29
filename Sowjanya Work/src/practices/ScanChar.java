package practices;

import java.util.Scanner;

public class ScanChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the char: ");
        char c = sc.next().charAt(5);

        System.out.println("Char value: " +c);
        sc.close();
    }
}
