
import java.util.Scanner;

public class UppercaseAndLowercaseAlphabet
{
    public static void main(String[] args) {
        char ch;
         Scanner scan = new Scanner(System.in);
        System.out.println("Enter the character for find case");
        ch= scan.next().charAt(0);

        if (ch>=65 && ch<=90){
            System.out.println(ch+ " is a upper case letter");
        }
        else if (ch>=97 && ch<=122){
            System.out.println(ch+ " is a lower case letter");
        }
        else {
            System.out.println(ch+ " is not an alphabet");
        }
    }
}



/*{
    public static void main(String[] args) {
        char ch; //variable declaration

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the character ");
        ch = sc.next().charAt(0); //store input from user

        if (ch>='A' && ch<='Z')
        {
            System.out.println(ch+"is an upper case letter");
        }
        else if (ch>='a' && ch<='z')
        {
            System.out.println(ch+ "is an lower case letter");
        }
        else {
            System.out.println(ch+ "is not an alphabet");
        }


    }
}*/



