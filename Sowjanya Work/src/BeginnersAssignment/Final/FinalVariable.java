package BeginnersAssignment.Final;

public class FinalVariable {

    final int MAX_VALUE=99;
    void myMethod(){
       // MAX_VALUE=101;// cannot assign a value to final variable MAX_VALUE
    }
    public static void main(String args[]){
        FinalVariable obj=new  FinalVariable();
        obj.myMethod();
    }
}
