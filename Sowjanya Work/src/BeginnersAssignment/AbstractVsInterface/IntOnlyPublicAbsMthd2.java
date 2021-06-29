package BeginnersAssignment.AbstractVsInterface;

public class IntOnlyPublicAbsMthd2 implements IntOnlyPublicAbsMthd1{

    public void display1() {
        System.out.println("display1 method");
    }

    public void display2(){
        System.out.println("display2 method");
    }

    public static void main(String[] args) {
        IntOnlyPublicAbsMthd2 obj = new IntOnlyPublicAbsMthd2();
        obj.display1();
    }
}
