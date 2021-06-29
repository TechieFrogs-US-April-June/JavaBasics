package BeginnersAssignment.AbstractVsInterface;

public class IntAbsNotMan2 implements IntAbsNotMan1{

    public void display1() {
        System.out.println("display1 method");
    }

    public void display2(){
        System.out.println("display2 method");
    }

    public static void main(String[] args) {
        IntAbsNotMan2 obj = new IntAbsNotMan2();
        obj.display1();
        obj.display2();
    }
}
