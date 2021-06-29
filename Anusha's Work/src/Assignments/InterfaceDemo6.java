package Assignments;

abstract class Example61{
    public abstract void display1();
}

class Example62 extends Example61{
    public void display1(){
        System.out.println("display1 method");
    }
    public void display2(){
        System.out.println("display2 method");
    }
}
class interfaceDemo6{
    public static void main(String args[]){
        Example62 obj=new Example62();
        obj.display1();
    }
}
