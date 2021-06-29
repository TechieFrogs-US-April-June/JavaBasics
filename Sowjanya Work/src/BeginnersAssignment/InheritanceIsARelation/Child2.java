package BeginnersAssignment.InheritanceIsARelation;

public class Child2 extends Parent2{
    String mainSubject = "Physics";

    public static void main(String args[]){
        Child2 obj = new Child2();
        /* Note: we are not accessing the data members
         * directly we are using public getter method
         * to access the private members of parent class
         */
        System.out.println(obj.getCollegeName());
        System.out.println(obj.getDesignation());
        System.out.println(obj.mainSubject);
        obj.does();
    }
}
