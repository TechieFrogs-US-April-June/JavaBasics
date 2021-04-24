import java.util.Scanner;

public class ScannerExample16 {
    public static void main(String[] args){
        
       
        Scanner sc = new Scanner("This is reset method 435 34543");
        System.out.println(sc.nextLine());
        if(sc.radix()<=34){
            sc.useRadix(32);  
        sc.reset();  
        System.out.println("Now Radix: "+sc.radix());
            
        }
        else if(sc.radix()>=34) 
        {
            System.out.println("radix rage should be positive and less than 34");
        } 
        else 
        {
        
            System.out.println("radix should be above zero, positive number and less than 34");
        }
        sc.close();
    }

    
}
