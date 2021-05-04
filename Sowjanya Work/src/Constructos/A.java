package Constructos;

public class A {
    int i,j;

   A() {
        System.out.println("Inside constructor A()");
        i = 10;
        j = 20;
    }
    A(int a , float b) {
        System.out.println(a + " " +b);
    }

    void function() {
        System.out.println("Inside function");
        i = i+1;
        j = j+1;
        System.out.println(i);
        System.out.println(j);
    }
    void display() {
        System.out.println("Another method");
        j = j+1;
        System.out.println(j);
    }

    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A(20, 56);
        //A a2 = new A();
        a2.function();
        a1.display();

    }
}
