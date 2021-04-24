import java.util.Scanner;

public class ScannerExample9 {
    public static void main(String[] args){
     
     Scanner sc = new Scanner("67 u7 & ?");  
        while(sc.hasNextInt()){  
            
            System.out.println(sc.nextInt());  
        }  
         
     sc.close();
    
    }
    
}
