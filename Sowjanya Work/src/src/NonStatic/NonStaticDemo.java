package NonStatic;

public class NonStaticDemo {
    int num;
    NonStaticDemo() {
        System.out.println("Inside the constructor");
    }

    {
        System.out.println("Inside the non static block");
    }

    public static void main(String[] args) {
        System.out.println("Inside the main method");
        new NonStaticDemo();
       // new NonStaticDemo();
       // new NonStaticDemo();
    }

    static {
        System.out.println("Inside the static block");
    }
}
