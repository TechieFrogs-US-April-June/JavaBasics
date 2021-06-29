package Assignments;

abstract class Example71{
    protected abstract void display1();
    public abstract void display2();
    public abstract void display3();
}
class Example72 extends Example71{
    public void display1(){
        System.out.println("display1 method");
    }
    public void display2(){
        System.out.println("display2 method");
    }
    public void display3(){
        System.out.println("display3 method");
    }
}
class interfaceDemo7{
    public static void main(String args[]){
        Example72 obj=new Example72();
        obj.display1();
    }
}