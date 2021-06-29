package InterfacesAssignment;

public interface Interface6 {
    void fun1();
    void fun2();
}

interface Inter1 {
    void function1();
    void function2();
}

interface Inter2 {
    void test1();
    void test2();
}

interface NewInterface extends Interface6,Inter1,Inter2 {
    void testDisplay();
}

class ConcreteClass {
    void display() {
        System.out.println("Inside ConcreteClass");
    }
}