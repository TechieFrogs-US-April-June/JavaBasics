package BeginnersAssignment.Final;

public class BlankFinalVariable1 {
    //Blank final variable
    final int ROLL_NO;

    BlankFinalVariable1(int rnum){
        //It must be initialized in constructor
        ROLL_NO=rnum;
    }

    void myMethod(){
        System.out.println("Roll no is:"+ROLL_NO);
    }

    public static void main(String[] args) {
        BlankFinalVariable1 obj = new BlankFinalVariable1(5678);
        obj.myMethod();
    }
}
