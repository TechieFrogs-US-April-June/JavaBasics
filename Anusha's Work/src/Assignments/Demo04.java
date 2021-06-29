package Assignments;

abstract class AbstractDemo{
    public void myMethod(){
        System.out.println("Hello");
    }
    abstract public void anotherMethod();
}
public class Demo04 extends AbstractDemo{

    public void anotherMethod() {
        System.out.print("Abstract method");
    }
    public static void main(String args[])
    {

        //AbstractDemo obj = new AbstractDemo();
        //obj.anotherMethod();
    }
}
