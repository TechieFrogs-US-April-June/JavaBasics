package Assignments;

abstract class Example41 {
    abstract void display1();
    public void display2(){
        System.out.println("display2 method");
    }
}
class Example42 extends Example41{
    public void display1(){
        System.out.println("display1 method");
    }
}
class interfaceDemo{
    public static void main(String args[]){
        Example42 obj=new Example42();
        obj.display1();
    }
}