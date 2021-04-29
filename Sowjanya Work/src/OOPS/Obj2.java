package OOPS;

public class Obj2 {
    int i = 0,j = 0;
    void fun1() {
        int i = 0;
        i = 25;
        j = 35;
        System.out.println("Inside fun1()");
        System.out.println(i);
        System.out.println(j);
        System.out.println("End of fun1()");
    }

    public static void main(String[] args) {
        Obj2 O = new Obj2();
        O.fun1();
        System.out.println(O.i);
        System.out.println(O.j);
    }
}
