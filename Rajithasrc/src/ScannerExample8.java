import java.util.Scanner;

public class ScannerExample8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value: ");           
            if(sc.hasNextDouble()){  
                
              System.out.println("Your entered value: " +sc.nextDouble());  
            }             
            else if (sc.hasNext())  
            {  
                System.out.println("Please Entered the Double Value.");  
              System.out.println("You entered: " + sc.next());  
            }  
            sc.close();  
    }
    
}
