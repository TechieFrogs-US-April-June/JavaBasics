package src.NestedClass;

class StaticNestedClassPractice {
     static int i = 10;
   //  private int x =15; 
  
     //Static Nested Class
     static class NestedClass
     {
         int a = 5;  // Declaring instance class inside static class
         private int b = 10;

         void display(){ //Method inside the static nested class
             a = 10;
             b = 15;
             i = 50;
             System.out.println(" Values i = "+i+ " a =" + a + " b = " + b);
         }

     }

     public static void main(String[] args) {
         //craeting object for instance variable inside the static class
         StaticNestedClassPractice.NestedClass nestedObj = new StaticNestedClassPractice.NestedClass();

         //nestedObj.b; //error

         System.out.println(nestedObj.b); 
         nestedObj.display();
     }
    
}
