package src.Assignments;



public class LargestAmongThreeNumbers {
    public static void main(String[] args) {
         int a = 10;
         int b = 90; 
         int c = 30;

         if (a>b && a>c){
             System.out.println("Largest Among Three Number is a = " + a);

         } 
         else if(b>a && b>c){
            System.out.println("Largest Among Three Number is b = " + b);
         } 
         else
         {
            System.out.println("Largest Among Three Number is c = " + c);
         }

         


    }
}
