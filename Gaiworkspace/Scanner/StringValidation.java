
import java.util.Scanner;

public class StringValidation {
    static String input;
    public static void main(String args[]) 
    {
        System.out.println("Enter a String ");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNext("[A-Za-z]*")) {
            input = sc.next();
            System.out.println("You entered a string value "+input);
        }else {
            System.out.println("Please Enter a Valid Value");
        }
        sc.close();
    }
    
}

