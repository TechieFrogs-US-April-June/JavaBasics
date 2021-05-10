package OopsAbstraction;

abstract class MyAbstraction {

    void myMethod() {
        System.out.println("Hello");
    }
    abstract public void anotherMethod();
}
class Demo extends MyAbstraction {

    public void anotherMethod() {
        System.out.println("Abstract method");
    }

     void myMethod() {
        System.out.println("Hi");
    }
}
public class Abstract {
    public static void main(String[] args) {
        //error : cant create object of it
       // MyAbstraction myObj = new MyAbstraction() {
        //}
        Demo demoObj = new Demo();
        //demoObj.anotherMethod();
        //demoObj.myMethod();
        MyAbstraction myObj = new Demo();
        myObj.anotherMethod();
        myObj.myMethod();
        demoObj.anotherMethod();
        demoObj.myMethod();
    }
}
