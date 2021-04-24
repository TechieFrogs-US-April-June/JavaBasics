import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter the number to check for Even/Odd :: ");
        if(scan.hasNextInt()){
        int a = scan.nextInt();
        scan.close();
        if (a%2 == 0) {System.out.println(" The number entered is EVEN....");}
            else{System.out.println(" The number entered is ODD!!!!");}
        }
        else {System.out.println("please enter INTEGER value");}
        
    }
}
