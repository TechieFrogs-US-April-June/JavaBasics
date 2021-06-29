package BeginnersAssignment.AbstractVsInterface;

public abstract class StaticAndFinalVarAbs1 {

    //Abstract class can have static, final or static final variables with any access specifier
    private int numOne=10;

    protected final int numTwo=20;

    public static final int numThree=500;

    public void display1(){
        System.out.println("Num1="+numOne);
    }


}
