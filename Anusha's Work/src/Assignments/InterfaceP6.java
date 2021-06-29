package Assignments;

interface Example31{
    public void display1();
}
interface Example32 extends Example31{
}
class Example33 implements Example32{
    public void display1(){
        System.out.println("display1 method");
    }
}
class interfaceP6{
    public static void main(String args[]){
        Example33 obj=new Example33();
        obj.display1();
    }
}