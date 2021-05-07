package InheritanceAssignment;

public class ParentClass1 {
     private void fun1() {
        System.out.println("This is parent class1");
    }
}

class ChildClass1 extends ParentClass1 {

    void funcA() {
        System.out.println("This is child class1");
    }

    public static void main(String[] args) {
        ParentClass1 parentObj1 = new ParentClass1();
        //parentObj1.fun1();
        ChildClass1 childObj1 = new ChildClass1();
        childObj1.funcA();
        //childObj1.func1();
    }
}
