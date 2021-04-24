import java.util.Scanner;

public class ScannerExample13 {
    
    public static void main(String[] args){
        Scanner sc= new Scanner("This is to check radix 67");
        System.out.println(" "+sc.nextLine());
        if(sc.radix()<=34){
        sc.useRadix(34);
        System.out.println("radix of string is"+sc.radix());
        }
        else if(sc.radix()>=34){
            System.out.println("radix rage should be positive and less than 34");
        }
        else{
            System.out.println("radix should be above zero, positive number and less than 34");  
        }
        sc.close();
    }

    
}
