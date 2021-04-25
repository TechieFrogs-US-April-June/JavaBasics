import java.util.Scanner;

public class ValidateAlphabetOrNot {
    public static void main(String[] args) {
        char ch;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a Character : ");
        ch = scan.next().charAt(0);

        if((ch>='a' && ch<='z') || (ch>'A' && ch<='Z'))
        {
            System.out.println(ch + " is an alphabet");
        }
        else{
            System.out.println(ch + " is not an Alphabet");
        }
    }
}
