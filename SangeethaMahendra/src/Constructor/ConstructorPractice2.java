package src.Constructor;

public class ConstructorPractice2 {
     
     // INVOKE CONSTRUCTOR
     public ConstructorPractice2()
      {
        System.out.println("I am in the Constructor");
        System.out.println("I am in the Constructor will excute whatever in this block");

     }
    
     //DUPLICATES WONT ALLOWED //
     //public ConstructorPractice2(){
       // }

     // PARAMETERIZED CONSTRUCTOR
     public ConstructorPractice2(int a, int b)
     {
        System.out.println("I am in the PARAMETERIZED Constructor");
        int c=a+b;
        System.out.println(c);
     }

    // SAME PARAMETERIZED CONSTRUCTOR WITH ONLY ONE PARAMETER WITH STRING
    public ConstructorPractice2(String str)
     {
        System.out.println(str);
     }

     // CREATE METHOD
     public void getdata(){
          System.out.println("I am the Method");
     }

    public static void main(String[] args) {
      // ConstructorPractice2 cd = new ConstructorPractice2(); //output : I am in the Constructor 
        ConstructorPractice2 cd1 = new ConstructorPractice2("Hello"); 
        ConstructorPractice2 c = new ConstructorPractice2(4,5);  // both Constructor will be executed
        System.out.println(cd1);
        System.out.println(c);
       
    }
    
}
