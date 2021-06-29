package Assignments;

class Example11{
    public void display1(){
        System.out.println("display1 method");
    }
}
abstract class Example12{
    public void display2(){
        System.out.println("display2 method");
    }
}
abstract class Example13 extends Example1{
    abstract void display3();
}
class Example14 extends Example13{
    public void display3(){
        System.out.println("display3 method");
    }
}
class interfaceP4{
    public static void main(String args[]){
        Example4 obj=new Example4();
        obj.display3();
    }
}
