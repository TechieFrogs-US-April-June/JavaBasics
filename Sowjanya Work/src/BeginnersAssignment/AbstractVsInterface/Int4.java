package BeginnersAssignment.AbstractVsInterface;

public class Int4 implements Int3{
    public void display1(){
        System.out.println("display1 method");
    }

    public void display2(){
        System.out.println("display2 method");
    }

    public static void main(String[] args) {
        Int4 obj = new Int4();
        obj.display1();
        obj.display2();
    }
}
