package OopsPolymorphism;

public class OverLoadedMethod {
    void overMethod(int i) {
        System.out.println("Inside int overloaded method");
    }

    void overMethod(float f) {
        System.out.println("Inside float overloaded method");
    }

    void overMethod(double d) {
        System.out.println("Inside double overloaded method");
    }

    void overMethod(String s) {
        System.out.println("Inside String overloaded method");
    }

    void overMethod(int i, double d) {
        System.out.println("Inside int double over loaded method");
    }

    public static void main(String[] args) {
        OverLoadedMethod meth = new OverLoadedMethod();
        meth.overMethod(1);
        meth.overMethod(1.0f);
        meth.overMethod(1.0);
        meth.overMethod("hello");
        meth.overMethod((int) 5.0);

        int a = 5;
        double d =a;
        int c = (int) d;

        meth.overMethod(a);
        meth.overMethod(d);
        meth.overMethod(c);

    }
}
