package BeginnersAssignment.AbstractVsInterface;

public class StaticAndFinalVarAbs2 extends StaticAndFinalVarAbs1{

    public void display2(){
        System.out.println("Num2="+numTwo);
        System.out.println("Num2="+numThree);
    }

    public static void main(String[] args) {
        StaticAndFinalVarAbs2 obj = new StaticAndFinalVarAbs2();
        obj.display2();
        obj.display1();
    }
}
