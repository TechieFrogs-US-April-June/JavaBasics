package OOPS;

public class SuperClassConstructor {
    int a, b;

    SuperClassConstructor(int x) {
        a = x;
        System.out.println("Inside constructor");
    }
}

    class SubClass extends SuperClassConstructor {

        SubClass() {
            super(6);
            System.out.println("Inside Subclass constructor");
        }

        public static void main(String[] args) {
            SubClass subobj = new SubClass();
            System.out.println(subobj.a+ " " +subobj.b);

        }
    }

