import java.util.Scanner;
public class MulTable {
    static float a,x;
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number for multiplication table ::  ");
        if(scan.hasNextInt() || scan.hasNextFloat()){
            a = scan.nextFloat();}
        else {System.out.println("Please enter INTEGER value");System.exit(1);}
        System.out.println("Enter the multiplication table length ::  ");
        if(scan.hasNextInt()){
            x = scan.nextFloat();}
        else {System.out.println("Please enter INTEGER value");System.exit(1);}
        scan.close();
        float res = 0;
        for(int i = 1; i <= x; i++)
        {
         res = a * i;
         System.out.println(a + " * " + i +  " = " + res);
        }
    }
}