package Assignments;

interface Inf1{
    public void method1();
}
interface Inf2 extends Inf1 {
    public void method2();
}
class interfacP3 implements Inf2{

    public void method1(){
        System.out.println("method1");
    }
    public void method2(){
        System.out.println("method2");
    }
    public static void main(String args[]){
        Inf2 obj = new interfacP3();
        obj.method2();
        obj.method1();
    }
}