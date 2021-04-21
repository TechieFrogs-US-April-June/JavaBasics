import java.util.Scanner;

public class AlphabeCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" enter to check if alphabet / not :: ");
        char a = scan.next().charAt(0);
        scan.close();
        if((a>='a' && a<='z') || (a>='A' && a<='Z')){
            System.out.print(a + " is alphabet");}
        else System.out.print(a + " is not an alphabet");
    }
}
