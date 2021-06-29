package BeginnersAssignment.SuperKeywordAndMethodOveriding;

public class SubClass extends SuperClass {
    /* The same variable num is declared in the Subclass
     * which is already present in the Superclass
     */
    int num = 110;
    void printNumber(){
        System.out.println(num);
    }
    public static void main(String args[]){
        SubClass obj= new SubClass();
        obj.printNumber();
    }
}
