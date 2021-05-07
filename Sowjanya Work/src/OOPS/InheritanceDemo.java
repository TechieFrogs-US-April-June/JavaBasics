package OOPS;

public class InheritanceDemo extends MySuperClass {
    int x = 500;
    String str;

    void print() {
        System.out.println("In inheritancedemo cls method");
    }
    InheritanceDemo(int x, int b) {
        System.out.println("In inheritancedemo constructor");
        System.out.println(+x+ " " +b);
        x = this.x;
        System.out.println("x value = " +x);

    }
    InheritanceDemo() {
        this.print();
        System.out.println("mhgehewlkyjkhwkl");
    }

    public static void main(String[] args) {
        InheritanceDemo inheritobj = new InheritanceDemo();
        InheritanceDemo inheritobj1 = new InheritanceDemo(30,40);
        inheritobj.print();
        System.out.println(inheritobj.x+ " " +inheritobj.str);
        inheritobj.display();
        System.out.println(inheritobj.a +" " +inheritobj.name+ " " +inheritobj.b);
    }
}
