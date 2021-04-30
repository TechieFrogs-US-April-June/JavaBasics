package src.Methods;

public class BasicMethod {
    int s1;

    // Method with Static Void
   static void display()
    {
        System.out.println("This is Void Method");
    }

    // Method with static return a value
   public static int add(int n1, int n2){ //n1 and n2 are formal parameters //user defined method   
       int s;
       s = n1 + n2;
       return s; // returning the sum
      
   }
    
   // Instance Method
   public int add1(int a, int b)
{
     s1 = a+b;
     return s1;
}  


public static void main(String[] args) {
        //Since void doesnt return any value, can be called directly
      display();  

      //calling static method
      int a =15;
      int b =5;
      int c =add(a,b); //a and b are actual parameters   //method calling // We can pass object references as well 
      System.out.println("The sum is a and b is  " +c) ;

      // Creating obj ref for Instance method 
      BasicMethod addObj = new BasicMethod();
      System.out.println(" The Sum is "+ addObj.add1(12,13));



    }
    
}
