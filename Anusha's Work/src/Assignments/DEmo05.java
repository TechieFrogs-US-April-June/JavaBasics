package Assignments;
abstract class A1{
    abstract void method1();
    public void method2(){
        System.out.println("Concrete Method of Parent class");
    }
}

public class DEmo05 extends A1 {
    public void method1(){
        System.out.println("Overridded Method");
    }
    public static void main(String[] args) {
        DEmo05 dObj=new DEmo05();
        dObj.method1();
        dObj.method2();
    }
}
