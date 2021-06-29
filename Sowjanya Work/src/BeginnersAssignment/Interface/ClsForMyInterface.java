package BeginnersAssignment.Interface;

public class ClsForMyInterface implements MyInterface{

    /* This class must have to implement both the abstract methods
     * else you will get compilation error
     */
    public void method1()
    {
        System.out.println("implementation of method1");
    }
    public void method2()
    {
        System.out.println("implementation of method2");
    }

    public static void main(String[] args) {

        MyInterface obj = new ClsForMyInterface();
        obj.method1();
        obj.method2();
    }


}
