import java.util.Scanner;
public class BooleanValidation {
    static Boolean input;
    public static void main(String args[]) 
    {
        System.out.println("Enter a boolean value ");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextBoolean()) {
            input = sc.nextBoolean();
            System.out.println("You entered a boolean value "+input);
        }else {
            System.out.println("Please Enter a Valid Value");
        }
    sc.close();

    }
    
}
