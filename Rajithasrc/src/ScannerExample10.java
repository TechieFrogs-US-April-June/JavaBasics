import java.util.Scanner;

public class ScannerExample10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(" 1 short string");
        while(sc.hasNextShort())
        {
            
            System.out.println("Short value is "+sc.nextShort());
            System.out.println("String is "+sc.next());
        }
        sc.close();
    
    }
    
}
