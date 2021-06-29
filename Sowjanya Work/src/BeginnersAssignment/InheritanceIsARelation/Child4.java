package BeginnersAssignment.InheritanceIsARelation;

public class Child4 extends Parent4MethodOverride{

    Child4(){
        System.out.println("Constructor of Child");
    }

    void disp(){
        System.out.println("Child Method");
        //Calling the disp() method of parent class
        super.disp();
    }

    public static void main(String args[]){
        //Creating the object of child class
        Child4 obj = new Child4();
        obj.disp();
    }

}
