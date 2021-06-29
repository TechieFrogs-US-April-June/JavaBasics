package Assignments;

class Example21{
    public void display1(){
        System.out.println("display1 method");
    }
}
abstract class Example22{
    public void display2(){
        System.out.println("display2 method");
    }
}
abstract class Example23 extends Example22{
    abstract void display3();
}
class Example24 extends Example23{
    public void display2(){
        System.out.println("Example4-display2 method");
    }
    public void display3(){
        System.out.println("display3 method");
    }
}
class interfaceP5{
    public static void main(String args[]){
        Example24 obj=new Example24();
        obj.display2();
    }
}
