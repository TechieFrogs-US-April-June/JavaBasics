import java.util.Scanner;

public class FindingLargest {
        static int a,b,c;
        static boolean x=true;
        public static void main(String[] args) {

      while(x){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st num  :: ");
        if(scan.hasNextInt()){
            a = scan.nextInt();
         break;
      }
        System.out.println("Please enter INTEGER value");
      }
      
      while(x){
         Scanner scan1 = new Scanner(System.in);

         System.out.println("Enter 2nd num  :: ");
         if(scan1.hasNextInt()){
             b = scan1.nextInt();
          break;}
         System.out.println("Please enter INTEGER value");
       }

       while(x){
         Scanner scan2 = new Scanner(System.in);

         System.out.println("Enter 3rd num  :: ");
         if(scan2.hasNextInt()){
             c = scan2.nextInt();
          break;}
         System.out.println("Please enter INTEGER value");
       }

        if (a>b && a>c) { System.out.println(a + "   is greatest number..!");}
        else if (b>a && b>c) { System.out.println(b + "   is greatest number..!");}
        else System.out.println(c + "   is greatest number..!");
    }
}
