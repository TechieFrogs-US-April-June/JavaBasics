import java.util.Scanner;

public class ScannerValidation {
    
    public static void main(String[] args) {

        System.out.println(" Enter the Name :  ");
       Scanner sc = new Scanner(System.in);
       String name = sc.next();
       //hasNextLine() used to check if there is another line in the input of this scanner or not.
       if (sc.hasNextLine())
       {
        System.out.println(sc.hasNextLine());
        System.out.println("Name is "+ name);
       }
       else
       {
        System.out.println("not a name");
       }
      
       sc.close();
       
       
    }
}
