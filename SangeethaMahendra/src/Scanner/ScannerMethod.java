import java.util.Scanner;

public class ScannerMethod {
    public static void main(String[] args) {
        
        //basic scanner input/output
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name ");
        String Name = sc.next();               //next() consider space as a next token 

        System.out.println("Enter Name ");
        String Name1 = sc.nextLine();        //nextLine it will print whole line

        System.out.println("Enter Number ");
        int a = sc.nextInt();
        byte b = sc.nextByte();
        short c = sc.nextShort();
        double d = sc.nextDouble();
        float e = sc.nextFloat();

        System.out.println("Enter True/False ");
        boolean num = sc.nextBoolean();
     //   System.out.println("Enter Name ");
       // String Name1 = sc.next();
        
       System.out.println("Enter Character ");
        char f = sc.next().charAt(0);

        //delimiter
        System.out.println(sc.delimiter());
        
        

        System.out.println(" Integer is = "+ a);
        System.out.println(" Byte is = "+ b);
        System.out.println(" Short is = "+ c);
        System.out.println(" Double is = "+ d);
        System.out.println(" float is = "+ e);
        System.out.println(" boolean is = "+ num);
        System.out.println(" Character is = "+ f);
        System.out.println(" String is = "+ Name);
        System.out.println(" String is = "+ Name1);
        sc.close();

        //


    }
    
}
