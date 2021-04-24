import java.util.Scanner;
import java.util.regex.Pattern;

public class ScannerExample15 {
    public static void main(String[] args){
       Scanner sc = new Scanner("Hello Java %$^$%^$%& 1werwe1, %$^$6, 898"); 
       Pattern pattern = Pattern.compile("[0-9]+");  
       while (sc.hasNext()) {  
             System.out.println("Output = " + sc.findWithinHorizon(pattern, 26));  
       }  
       sc.close(); 
    }
    
}
