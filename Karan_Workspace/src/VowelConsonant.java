import java.util.Scanner;

public class VowelConsonant {
    static boolean x=true;
    static String len;
    public static Scanner scan = new Scanner(System.in);

    static void alpha() {
        while(x){
        System.out.println(" enter to check if consonent / Vowel :: ");
        len = scan.next();

        if(len.length()==1){
        break;
        }
        System.out.println("Please enter only ONE character");
        }
    }

    static boolean numcheck()
    {
        try {
            Integer.parseInt( len );
            return true;
        }
        catch( Exception e ) {
            return false;
        }
    }
        
    public static void main(String[] args) {

        while(x){
        alpha();
        numcheck();
        if (numcheck()==false){
            char a = len.charAt(0);
            if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' )
            {System.out.println("entered alphabet  " +a  + "  is vowel");}
        else{ System.out.println("entered alphabet  " +a  + "  is consonant");}
        break;}
        System.out.println("You have entered a NUMBER. So please enter an ALPHABET");
        
    }
        
    }
}
