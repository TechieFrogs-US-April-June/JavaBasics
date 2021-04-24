import java.util.Scanner;

public class AlphabeCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" enter to check if alphabet / not :: ");
        String len = scan.next();
        if(len.length()==1){
        char a = len.charAt(0);
        scan.close();
        if((a>='a' && a<='z') || (a>='A' && a<='Z')){
            System.out.print(a + " is alphabet");}
        else {System.out.print(a + " is not an alphabet");}
        }
        else {System.out.println("Please enter only ONE character");}
    }
    
}
