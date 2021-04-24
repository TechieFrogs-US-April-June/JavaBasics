import java.util.Scanner;

public class ScannerExample1 {
     public static void main(String[] args) {
        Scanner sc = new Scanner("String 4539475734465L");
        while(sc.hasNext()){
            System.out.println("Print next token:"+sc.next());
            if(sc.hasNextLong())
            System.out.println("print long value:"+sc.nextLong());

        }
       
       sc.close();
    }
        
    }
    

