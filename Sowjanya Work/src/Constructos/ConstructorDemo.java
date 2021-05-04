package Constructos;

class A1 {
    int a,b,i;
    static int c;
    final String name = "Constructor" ;
    public static int d;

    A1(int i) {
        System.out.println("This is constructor");
    }
    void func5() {
        i = i+1;
        System.out.println(i);
        System.out.println("End of fun5()");
        System.out.println(a+ " " +b+ " " +c+ " " +d);
        System.out.println(name);
    }
    A1(int x,int y) {
        System.out.println(x+ " " +y);
    }
}
class B1 {
    int i ,j;

    B1(int i,int j) {
        System.out.println("Inside constructor B1()");
        System.out.println(i+ " " +j);

    }
    void functionA() {
        int i = 100;
        int j = 200;
        System.out.println(i + 10);
        System.out.println(j + 20);
    }

}

public class ConstructorDemo {
    public static void main(String[] args) {
        A1 a1 = new A1(20);
        A1 a2 = new A1(30,50);
        a1.func5();
        B1 b1 = new B1(10,20);
        b1.functionA();


    }

}
