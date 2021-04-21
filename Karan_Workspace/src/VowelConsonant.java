import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter an Alphabet to check if Consonent / Vowel :: ");
        char a = scan.next().charAt(0);
        scan.close();
        if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' )
            {System.out.println("entered alphabet  " +a  + "  is vowel");}
        else{System.out.println("entered alphabet  " +a  + "  is consonant");}
    }
}
