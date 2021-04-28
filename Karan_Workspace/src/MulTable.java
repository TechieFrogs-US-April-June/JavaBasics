import java.util.Scanner;
public class MulTable {
    static float a,x;
    static boolean t=true;
        public static void main(String[] args) {
        while(t) 
        {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number for multiplication table ::  ");
        if(scan.hasNextInt() || scan.hasNextFloat()){
            a = scan.nextFloat();
            break;}
         System.out.println("Please enter INTEGER value");
        }

        while(t)
        {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter the multiplication table length ::  ");
        if(scan1.hasNextInt()){
            x = scan1.nextFloat();
            break;}
        System.out.println("Please enter INTEGER value");
        }

        float res = 0;
        for(int i = 1; i <= x; i++)
        {
         res = a * i;
         System.out.println(a + " * " + i +  " = " + res);
        }
    }
}
