package EncapsulationAssignment;

class A{
    static void print() {
        System.out.println("Parent");
    }
}

class B extends A {
    static void print() {
        System.out.println("Child");
    }
}
public class Exercise8 {
    public static void main(String[] args) {
        A aObj = new A();
        B bObj = new B();
        A abObj = new B();
        aObj.print();
        bObj.print();
        abObj.print();
    }
}
