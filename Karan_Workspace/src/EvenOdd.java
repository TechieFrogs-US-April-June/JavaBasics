import java.util.Scanner;

public class EvenOdd {
    static boolean x=true;
    public static void main(String[] args) {
        while(x){
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter the number to check for Even/Odd :: ");
        if(scan.hasNextInt()){

        int a = scan.nextInt();

        if (a%2 == 0) {System.out.println(" The number entered is EVEN....");
        break;}
            else{System.out.println(" The number entered is ODD!!!!");
            break;}
        }
         System.out.println("please enter INTEGER value");
    }
    }
}
