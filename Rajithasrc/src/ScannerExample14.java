import java.util.Scanner;

public class ScannerExample14 {
    public static void main(String[] args){
        Scanner sc= new Scanner("This is to check remove");
        System.out.println("print "+sc.nextLine());
        
        if(sc.hasNext())
        {
            sc.remove();
            System.out.println("Exception here");
        }

        
        sc.close();
    }
    
}
