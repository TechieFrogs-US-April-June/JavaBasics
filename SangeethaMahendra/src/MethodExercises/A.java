package src.MethodExercises;

public class A {

    static void print() {
        System.out.println("Parent");
    }
}

class B extends A {
    
    static void print() {
        System.out.println("Child");
    }
}

class C extends A{
    public static void main(String[] args) {
      // A a = new A(); //this is asked by question
        // a.print();
       A.print();
     

        // B b = new B(); //this is asked by question
       //   b.print();
       B.print();
    

     // A c = new B();  //this is asked by question
     // c.print();
      C.print();
     
 }
}