import java.util.Scanner;

public class ScannerExample18 {
    public static void main(String[] args){
        Scanner sc= new Scanner("I am Rajitha|learning/Java");
        sc.useDelimiter(" ");
        sc.tokens();
        System.out.println(sc.next());
        sc.close();
    }
    
}
