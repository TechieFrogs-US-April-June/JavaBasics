package SirishaWork.src.EncapsulationAssignment;

 class ClassA {
     static void print() {
         System.out.println("Parent");
     }
}

class B extends ClassA {
     static void print(){
         System.out.println("Child");
     }
}
    public class Method8 {
    public static void main(String[] args) {
        ClassA aObj = new ClassA();
        B bObj = new B();
        ClassA abObj = new B();

        aObj.print();
        bObj.print();
        abObj.print();
    }
}
