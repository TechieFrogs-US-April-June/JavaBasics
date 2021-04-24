import java.util.Scanner;

public class Swapping {
    static int a,b;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter the first number :: ");
        if(scan.hasNextInt()){
            a = scan.nextInt();}
        else {System.out.println("Please enter INTEGER value");System.exit(1);}       
        System.out.println(" Enter the second number :: ");
        if(scan.hasNextInt()){
            b = scan.nextInt();}
        else {System.out.println("Please enter INTEGER value");System.exit(1);}        scan.close();
        System.out.println("Number before swapping are :: "  +a +"  and  "+b);
        int SWAP = a;
        a = b;
        System.out.println("Number after swapping are  :: "  +a +"  and  " +SWAP);
    }
}
