import java.util.Scanner;

public class ValidationProgram {
    public static void main(String[] args){
      
                    

            Scanner sc= new Scanner(System.in);
            int a;
            int b;
            
                            
               do{
                    System.out.println("Enter the numbers");

                    if(!sc.hasNextInt()){

                    System.out.println("These are not valid integers");
                    sc.next();
                    sc.next();
                    }
                    
                                     
                        a=sc.nextInt();
                        b=sc.nextInt();
                        
                    }while(a<=0 || b<=0);
                    

                    System.out.println("a is valid integer "+ a);
                    System.out.println("b is valid integer "+ b);


                    a=a+b;
                    b=a-b;
                    a=a-b;
                    System.out.println("now a is "+a);
                    System.out.println("now b is "+b);

               
                sc.close();

            
            

    }
}
