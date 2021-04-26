import java.util.Scanner;

public class AlphabeCheck {
    static boolean x=true;
    static char a;

    static void alpha() {
        while(x){
        Scanner scan = new Scanner(System.in);
        System.out.println(" enter to check if alphabet / not :: ");
        String len = scan.next();

        if(len.length()==1){
        a = len.charAt(0);
        break;
        }
        System.out.println("Please enter only ONE character");
        }
    }
    public static void main(String[] args) {
        alpha();

        while(x){

        if((a>='a' && a<='z') || (a>='A' && a<='Z')){
            System.out.print(a + " is alphabet");
            break;}
        
         System.out.print(a + " is not an alphabet");
         System.out.printf("%n");
         System.out.println("Please enter an ALPHABET...!!!");
         alpha();
        }
        }
    }
