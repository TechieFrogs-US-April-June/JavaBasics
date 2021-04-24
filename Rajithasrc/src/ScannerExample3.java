import java.util.Scanner;
import java.util.regex.Pattern;

public class ScannerExample3 {

    public static void main(String[] args){
        Scanner sc= new Scanner("This is a String165674423222222219$#% ");
        
        System.out.println("output "+sc.findInLine("is"));
        System.out.println("output 1 "+sc.findInLine(Pattern.compile(".tring")));
        System.out.println("output 2 "+sc.findInLine(Pattern.compile("[0-9].*")));

        
          //  
  
        
        sc.close();
    }
    
}
