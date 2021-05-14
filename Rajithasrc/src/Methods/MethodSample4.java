package Methods;

class A1{
   public static void print(){
        System.out.println("Parent");
    }
}

class B1 extends A1{
    public static void print(){
        System.out.println("Child");
    }
}

public class MethodSample4 {
    public static void main(String[] args) {
    
        B1 b1 = new B1();

        b1.print();
        B1.print();
        A1 a1 = new A1();
        a1.print();
        A1.print();

        A1 obj = new B1();
        obj.print();
        
    }
}
