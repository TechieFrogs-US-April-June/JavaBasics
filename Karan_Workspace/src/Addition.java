import java.util.Scanner;

public class Addition {
    static int a;
    static boolean x=true;
    public static void main(String[] args) {
     while(x){ 

        System.out.println("enter the first number ::  ");

        Scanner scan = new Scanner(System.in);
       
        if(scan.hasNextInt())
        {
             a = scan.nextInt();
             break;
        } 
        System.out.println("Please enter INTEGER value");
     }

     while(x){
          
     Scanner scan1 = new Scanner(System.in);
     System.out.println("enter the second number ::  ");

         if(scan1.hasNextInt()){
              a = a + scan1.nextInt();
              break;
           }
            System.out.println("Please enter INTEGER value");
     }
     System.out.println("result is ::  " + a);
}
}