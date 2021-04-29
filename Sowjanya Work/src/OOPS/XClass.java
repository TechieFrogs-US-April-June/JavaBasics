package OOPS;

public class XClass {
    int i = 0;
    void funx() {
        i = i+1;
        i = i*i;
    }

    public static void main(String[] args) {
        XClass x1 = new XClass();
        x1.i = 2;
        x1.funx();
        System.out.println(x1.i);
    }
}
