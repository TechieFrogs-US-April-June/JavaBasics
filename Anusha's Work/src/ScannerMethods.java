import java.util.Scanner;

public class ScannerMethods {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string:");
        String str;
       if(sc.hasNext(("[a-z A-Z]*"))){
           str=sc.next();
           System.out.println("String entered: "+ str);

       }




    }
}
