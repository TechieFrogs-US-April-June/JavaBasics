package BeginnersAssignment.InheritanceIsARelation;

public class Child1 extends Parent1{
    String mainSubject = "Physics";

    public static void main(String args[]){
        Child1 obj = new Child1();
        System.out.println(obj.collegeName);
        System.out.println(obj.designation);
        System.out.println(obj.mainSubject);
        obj.does();
    }
}
