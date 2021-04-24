import java.util.Scanner;

public class ScannerExample4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(" 43435.7 This is BigDecimal Value ");
        while(sc.hasNextBigDecimal()){
System.out.println("Big Decimal value in string is :"+sc.nextBigDecimal());
System.out.println("the next token is:"+sc.next());
        }
        
        
        sc.close();
    }
    
}
