package OOPS;

public class OverridingFunction {
    int i , j;

    void function1() {
        System.out.println("Inside function1() od class Overriding");

    }
    void functionA() {
        System.out.println("Inside functionA() of class Overriding");
    }
}

class Msd extends OverridingFunction {
    int x ,j;

    void functionB() {
        System.out.println("Inside functionB() of class Msd");
    }
   void function1() {
        System.out.println("Inside function1() of class Msd");
   }

    public static void main(String[] args) {
        Msd m1 = new Msd();
        m1.j = 30;
        m1.function1();
        m1.functionA();
        m1.i = 115;

    }
}
