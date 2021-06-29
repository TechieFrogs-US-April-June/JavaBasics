package BeginnersAssignment.AbstractVsInterface;

public class IntPubStaticFinalVar2 implements IntPubStaticFinalVar1 {

    public void display1(){
        System.out.println("Num1="+numOne);
    }

    public static void main(String[] args) {
        IntPubStaticFinalVar2 obj = new IntPubStaticFinalVar2();
        obj.display1();
    }
}
