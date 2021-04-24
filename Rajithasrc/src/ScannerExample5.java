import java.util.Scanner;

public class ScannerExample5 {

    public static void main(String[] args){
        Scanner sc=new Scanner("43534534543 fdgdfgdfg");
        if(sc.hasNextBigInteger())
            System.out.println("BigInteger value is :"+sc.nextBigInteger());
        else
        System.out.println("No big integer is found");
        sc.close();
    }
    

}
