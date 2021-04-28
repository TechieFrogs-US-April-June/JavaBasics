
class OuterClass // Outerclass
{   
    // outer class instance variable // created obj ref in the main method with outer class
    int a = 10; 

    // outer class instance variable //private variable can be accessed in the inner class directly 
        private int c; 

    // static variable of outer class // can be accessed directly in the main class
       static int b; 
                
          // Inner class/ Nested inner class; inner class can have access modifiers
         protected class InnerClass
              {
                  // only static final variable allowed in the non static nested/inner class
                    static final int x = 5; 
                     int num;
                     private int z = 6;

                     // outer class can be accessed directly in to inner clas
                                                                                         
                     void display() {
                        System.out.println("The Values of the Inner Classes are " + x + " " + num + " " + z); 
                          System.out.println("The Values of the Outer Classes are " + a + " " + b + " " + c); 
                     }

                  //   static class InnerStatic{

             }
         // static class InnerStatic{ // static nested class


          //}

           

    // one way of creating object for inner class using method
    // here craeting object reference for inner class method display();
    void display1() {    // Member of a outer class 
        InnerClass inner = new InnerClass();
        inner.display();

    }
}

public class InnerClassPractice { // Driver class
    public static void main(String[] args) {

        // Another way of creating object for inner class in main method
        OuterClass outerClassobj = new OuterClass(); // first obj ref for outer class instance variable
        outerClassobj.a = 30;

        //static variable of outer class driectly accessed with outer class name
        OuterClass.b = 40;
       

        OuterClass.InnerClass innerObj = outerClassobj.new InnerClass(); // 2nd obj ref for inner class instance variable
        innerObj.num = 100;
        innerObj.display();
        outerClassobj.display1();
        
       // OuterClass.InnerClass.x;



        
    }

}
