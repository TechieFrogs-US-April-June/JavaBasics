import java.util.Scanner;

public class ScannerEvenOrOdd {
    
        public static void main(String[] args){
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter integer a value");
            int a=sc.nextInt();
            System.out.println("a value is "+a);
            if (a%2==0)//after modular division if remainder is zero it is even if remainder is 1 it is odd number
                System.out.println("a is Even Number");
            else
                System.out.println("a is Odd Number");
                sc.close();
        }
        
    }
    

