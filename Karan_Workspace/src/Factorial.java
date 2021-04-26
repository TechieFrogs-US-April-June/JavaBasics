import java.util.Scanner;
public class Factorial {
    static boolean t=true;
    public static void main(String[] args) {
        while(t){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to find factorial :: ");
        if(scan.hasNextInt()){
        int a = scan.nextInt();
        scan.close();
        int x = 1;
        int y = 1;
        while(y <= a)
        {
            x = x*y;
            y++;
        }
        System.out.println(x);
    break;}
          System.out.println("Please enter INTEGER value");
    }
}
}
