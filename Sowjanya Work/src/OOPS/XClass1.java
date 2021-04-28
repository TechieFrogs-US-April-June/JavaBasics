package OOPS;

public class XClass1 {
    int j =1;
    void fun1() {
        j = j+1;
        XClass x1 = new XClass();
        x1.i = 15;
        System.out.println(x1.i);
    }

    public static void main(String[] args) {
        XClass1 O = new XClass1();
        O.fun1();
        XClass x1 = new XClass();
        System.out.println(x1.i);
    }
}
