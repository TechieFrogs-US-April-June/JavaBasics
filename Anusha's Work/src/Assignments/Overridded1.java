package Assignments;

class A{
    public void myMethod(){
        System.out.println("Overridden Method");
    }
}
public class Overridded1 extends A{

    public void myMethod(){
        System.out.println("Overriding Method");
    }
    public static void main(String args[]){
        A obj = new Overridded1();
        obj.myMethod();
    }
}