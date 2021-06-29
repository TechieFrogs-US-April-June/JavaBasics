package InheritanceAssignment;

 class ParentClass{

    void fun1() {
        System.out.println("This is parent class");
    }
}

class ChildClass extends ParentClass {

    void funA() {
        System.out.println("This is child class");
    }

}
public class TestInheritance {

    public static void main(String[] args) {
        ParentClass parentObj = new ParentClass();
        parentObj.fun1();
        ChildClass childObj = new ChildClass();
        childObj.funA();
        childObj.fun1();
    }
}
