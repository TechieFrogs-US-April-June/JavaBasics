package BeginnersAssignment.SuperKeywordAndMethodOveriding;

public class ChildMethodOveride extends ParentMethodOveride {

    //Overriding method
    void display(){
        System.out.println("Child class method");
    }
    void printMsg(){
        //This would call Overriding method
        display();
        //This would call Overridden method
        super.display();
    }
    public static void main(String args[]){
        ChildMethodOveride obj= new ChildMethodOveride();
        obj.printMsg();
    }
}
