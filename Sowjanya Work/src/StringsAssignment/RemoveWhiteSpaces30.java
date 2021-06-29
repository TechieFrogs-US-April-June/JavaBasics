package StringsAssignment;

import java.util.Scanner;

public class RemoveWhiteSpaces30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String st = sc.nextLine();

        System.out.println("String white spaces removed: " +st.replace(" ", ""));

    }
}
