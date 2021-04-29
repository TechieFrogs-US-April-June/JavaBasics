package Constructos;

public class Basic {
    int x,y;
    private static int j;
    final int z = 0;

    Basic(int i) {
        i = i+1;
        System.out.println(i);
        System.out.println(x);
        System.out.println(y);
    }
   private void fun1() {
        x = x+1;
        j = j+1;
        final int z = 25;
        System.out.println("x= " +x + "j= " +j);
       System.out.println(z);
    }
    void display() {
        System.out.println("This is a method");
        x = x+10;
        j = j+60;
        System.out.println("x= " +x + "j= " +j);
    }

    Basic(int x, int y) {
        System.out.println(x +" " +y);

    }
    void fun2() {
       j = j+20;
        System.out.println("This is fun2()");
        System.out.println(j);
    }

    public static void main(String[] args) {
        Basic b1 = new Basic(50,101);
        Basic b2 = new Basic(99);
        b1.fun2();
        b2.fun1();
        b1.display();

    }
}
