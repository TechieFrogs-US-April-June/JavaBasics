package BeginnersAssignment.Final;


public class UninitializedStaticFinalVariable {
    //static blank final variable
    static final int ROLL_NO;
    //static block
    static{
        ROLL_NO=1230;
    }
    public static void main(String args[]){
        System.out.println(UninitializedStaticFinalVariable.ROLL_NO);
    }
}
