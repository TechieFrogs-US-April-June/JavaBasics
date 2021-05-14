package OOPS;

public class A1 {
    int i = 10;
    A a1 = new A();
    A a2;

    public static void main(String[] args) {
        A1 d1 = new A1();
        System.out.println(d1.a2);
        System.out.println(d1.i);

        int x = d1.i;
        System.out.println(d1.a1);
        d1.i = 25;
        d1.a1.i = 10;
        d1.a1.functionA();
        //System.out.println();
        System.out.println(d1.a2);
        d1.a2 = d1.a1;
        System.out.println(d1.a2.i);
        //d1.j = d1.i;
        d1.a2 = new A();
        System.out.println(d1.a2.i);

    }
}
