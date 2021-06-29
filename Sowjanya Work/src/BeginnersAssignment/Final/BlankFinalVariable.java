package BeginnersAssignment.Final;

public class BlankFinalVariable {
    //Blank final variable
    final int MAX_VALUE;

    BlankFinalVariable(){
        //It must be initialized in constructor
        MAX_VALUE=100;
    }

    void myMethod(){
        System.out.println(MAX_VALUE);
    }

    public static void main(String[] args) {
        BlankFinalVariable obj = new BlankFinalVariable();
        obj.myMethod();
    }
}
