package AbstractAssignment;

abstract class Parent {

    //abstract void message();
    void message() {
        System.out.println("This is parent class");
    }
}

class Child extends Parent {
    //void message() {
      //  System.out.println("This is first subclass");
    //}
    void message() {
        System.out.println("This is first subclass");
    }
}

class Child1 extends Parent {
    //void message() {
      //  System.out.println("This is second subclass");
    //}
    void message() {
        System.out.println("This is second subclass");
    }
}
public class Abstract1 {

    public static void main(String[] args) {
        Child1 cObj1 = new Child1();
        cObj1.message();

        Child cObj = new Child();
        cObj.message();
    }

}
