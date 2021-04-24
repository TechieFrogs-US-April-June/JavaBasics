import java.util.Scanner;


public class ScannerInputExample {
    public static void main(String[] args){
        
        

        Scanner sc = new Scanner(System.in);
         
         System.out.println("Enter byte value : ");
         byte a=sc.nextByte();
         
         System.out.println("Enter short value : ");
         short b=sc.nextShort();

         System.out.println("Enter interger value :");
         int c=sc.nextInt();

         System.out.println("Enter Long value : ");
         long d=sc.nextLong();
     
         System.out.println("Enter Float value :");
         float e=sc.nextFloat();

         System.out.println("Enter Double value :");
         double f=sc.nextDouble();

         System.out.println("Boolean value is ");
         Boolean i=sc.nextBoolean();

         
         
        
         System.out.println("Enter String : ");
         //String h=sc.nextLine();
          //System.out.println("trying next method");
          String h=sc.next();

          System.out.println("Enter Character :");
          char g=sc.next().charAt(0);
 
         
         
           
         System.out.println("Byte value is "+ a);
         System.out.println("Short value is "+ b);
         System.out.println("Integer value is "+ c);
         System.out.println("Long value is "+ d);
         System.out.println("Float value "+ e);
         System.out.println("Double value is "+ f);
         System.out.println("Character is "+ g);
         System.out.println("String is "+ h);
         System.out.println("Boolean value is "+ i);



         if(sc.hasNextFloat())
         System.out.println("Float value is "+sc.nextFloat());
         else
         System.out.println("No Floarting value "+sc.next());



         sc.close();

    }
    
}
