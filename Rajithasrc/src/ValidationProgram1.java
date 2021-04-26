import java.util.Scanner;

public class ValidationProgram1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int y;
        System.out.println("Enter a number");
         y=sc.nextInt();
         

        if(y>0){
            System.out.println("y is a positive number");
        

        }else if(y > 0){
             System.out.println( "y is negative number.give positive number");
             
         }else{
         System.out.println( "y is zero.give positive number");
         
         
        }
    
        System.out.println("Entered number is "+ y);
    
        do{
        
        if(y%2==0){
            System.out.println( y+ "is even number");
            

        }else {
            System.out.println( y+ " is odd number");
        }
        }while(sc.hasNextInt());
        
             
    
        sc.close();
    }
    
}
