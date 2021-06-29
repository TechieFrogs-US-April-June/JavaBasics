package BeginnersAssignment.AbstractVsInterface;

public class AbsKeyMan2 extends AbsKeyMan1{

    public void display1() {
        System.out.println("display1 method");
    }

    public void display2() {
        System.out.println("display2 method");
    }

    public static void main(String[] args) {
        AbsKeyMan2 obj = new AbsKeyMan2();
        AbsKeyMan1 obj1 = new AbsKeyMan2();
        obj.display1();
        obj.display2();
        obj1.display1();
        obj1.display2();
    }

}
