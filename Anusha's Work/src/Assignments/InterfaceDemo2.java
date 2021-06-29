package Assignments;

interface Example51{
    public abstract void display1();
}
class Example52 implements Example51{
    public void display1(){
        System.out.println("display1 method");
    }
}
class interfaceDemo5{
    public static void main(String args[]){
        Example52 obj=new Example52();
        obj.display1();
    }
}
