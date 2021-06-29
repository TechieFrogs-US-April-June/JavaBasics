package BeginnersAssignment.SuperKeywordAndMethodOveriding;

public class ChildNotOveriding extends ParentNotOveriding {

    void printMsg(){
        /* This would call method of parent class,
         * no need to use super keyword because no other
         * method with the same name is present in this class
         */
        display();
    }
    public static void main(String args[]){

        ChildNotOveriding obj= new ChildNotOveriding();
        obj.printMsg();
    }
}
