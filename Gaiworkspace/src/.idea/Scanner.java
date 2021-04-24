import java.util.Scanner;
public class Scanner {
    public static void main(String args[]) 
    {
        int input = 0;
        System.out.println("Enter an Integer value ");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()) {
            input = sc.nextInt();
            if(input>0)
                System.out.println("You entered a positive integer "+input);
            else {
                System.out.println("You entered a negative integer "+input);
            }
        }else {
            System.out.println("Please Enter Valid Integer");
        }
    }
    
}
