package Assignments;

class FinalPgm2{
    final int MAX_VALUE;
    FinalPgm2(){
        MAX_VALUE=100;
    }
    void myMethod(){
        System.out.println(MAX_VALUE);
    }
    public static void main(String args[]){
        FinalPgm2 obj=new  FinalPgm2();
        obj.myMethod();
    }
}
