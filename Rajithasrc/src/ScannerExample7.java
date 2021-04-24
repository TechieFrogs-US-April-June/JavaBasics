import java.util.Scanner;

public class ScannerExample7 {
    public static void main(String[] args){
        Scanner sc=new Scanner("23 String 78  fgfd ggf");
        
        
        if(sc.hasNextByte())
        System.out.println("value is "+sc.nextByte());
        System.out.println("now print next is "+sc.next());
        sc.close();
    }

    
}
