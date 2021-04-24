import java.util.Scanner;

public class ScannerExample12 {
    public static void main(String[] args){
        Scanner sc= new Scanner("This is Java program");
        System.out.println("check the string "+sc.hasNext("This"));
        if(sc.next()=="This"){

                System.out.println("matching the string"+sc.match());
        
            System.out.println("Exception error");
        }
        System.out.println("Now the string is "+sc.nextLine());
        
        
        sc.close();
    }
    
}
