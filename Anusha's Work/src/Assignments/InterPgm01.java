package Assignments;

abstract class Example81{
    private int numOne=10;
    protected final int numTwo=20;
    public static final int numThree=500;
    public void display1(){
        System.out.println("Num1="+numOne);
    }
}
class Example82 extends Example81{
    public void display2(){
        System.out.println("Num2="+numTwo);
        System.out.println("Num2="+numThree);
    }
}
class InterPgm1{
    public static void main(String args[]){
        Example82 obj=new Example82();
        obj.display1();
        obj.display2();
    }
}