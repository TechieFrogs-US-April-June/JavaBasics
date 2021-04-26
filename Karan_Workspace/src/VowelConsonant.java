import java.util.Scanner;


public class VowelConsonant {
    static boolean x=true;

    static void alpha() {
        while(x){
        Scanner scan = new Scanner(System.in);
        System.out.println(" enter to check if consonent / Vowel :: ");
        String len = scan.next();

        if(len.length()==1){
        break;
        }
        System.out.println("Please enter only ONE character");
        }
    }
    public static void main(String[] args) {
        while(x){
        alpha();
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter an Alphabet to check if Consonent / Vowel :: ");
        char a = scan.next().charAt(0);
        if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' )
            {System.out.println("entered alphabet  " +a  + "  is vowel");
        break;}
        System.out.println("entered alphabet  " +a  + "  is consonant");
    }
        
    }
}
