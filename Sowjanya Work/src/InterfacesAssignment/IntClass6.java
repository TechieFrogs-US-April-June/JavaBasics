package InterfacesAssignment;

public class IntClass6 extends ConcreteClass implements NewInterface{
    public void fun1() {
        System.out.println("Inside IntClass6 fun1 method");
    }

    public void fun2() {
        System.out.println("Inside IntClass6 fun2 method");
    }

    public void function1() {
        System.out.println("Inside IntClass6 function1 method");
    }

    public void function2() {
        System.out.println("Inside IntClass6 function2 method");
    }

    public void test1() {
        System.out.println("Inside IntClass6 test1 method");
    }

    public void test2() {
        System.out.println("Inside IntClass6 test2 method");
    }

    public void testDisplay() {
        System.out.println("Inside IntClass6 testDisplay method");
    }

    public void method1(Interface6 intObj) {
        intObj.fun1();
        intObj.fun2();
    }

    public void method2(Inter1 intObj) {
        intObj.function1();
        intObj.function2();
    }

    public void method3(Inter2 intObj) {
        intObj.test1();
        intObj.test2();
    }

    public void method4(NewInterface intObj) {
        intObj.testDisplay();
    }

    public static void main(String[] args) {
        IntClass6 intObj = new IntClass6();
        intObj.method1(intObj);
        intObj.method2(intObj);
        intObj.method3(intObj);
        intObj.method4(intObj);
        intObj.display();
        intObj.testDisplay();
    }
}
