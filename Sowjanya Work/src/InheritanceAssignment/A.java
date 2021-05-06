package InheritanceAssignment;

public class A {
    int i , j;
    A() {

    }
    A(int i, int j) {
        this.i = i;
        this.j = j;
    }
    void show() {
        System.out.println(i+ " " +j);

    }
}
class B extends A {
    int k;
    B() {

    }
    B(int x) {
        k = x;
    }
    //overriding show() method
    void show() {
        System.out.println(k);
    }

    public static void main(String[] args) {
        A obj1 = new A();
        B obj = new B(6);
        obj.show();



    }
}
