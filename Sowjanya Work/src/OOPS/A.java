package OOPS;

public class A {
    int i ,j;
    void functionA() {
        System.out.println(i + 10);
        System.out.println(i + 20);
    }

    public static void main(String[] args) {
        A a1 = new A();
        int x = 10;
        System.out.println(x);
        System.out.println(a1);//address of object will be displayed
    }
}
