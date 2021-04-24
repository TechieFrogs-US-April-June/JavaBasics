import java.util.Scanner;
public class FloatingValidation {
    static Double input;
    public static void main(String args[]) 
    {
        System.out.println("Enter a floating point value ");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextDouble()) {
            input = sc.nextDouble();
            if(input>0)
                System.out.println("You entered a positive value "+input);
            else {
                System.out.println("You entered a negative value "+input);
            }
        }else {
            System.out.println("Please Enter a Valid Value");
        }
        sc.close();
    }
    
}
