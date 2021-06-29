package BeginnersAssignment.SuperKeywordAndMethodOveriding;

public class Child1 extends Parent1{

    Child1(){
        /* super() must be added to the first statement of constructor
         * otherwise you will get a compilation error. Another important
         * point to note is that when we explicitly use super in constructor
         * the compiler doesn't invoke the parent constructor automatically.
         */
        super("Hahaha");
        System.out.println("Constructor of child class");

    }
    void display(){
        System.out.println("Hello");
    }
    public static void main(String args[]){
        Child1 obj= new Child1();
        obj.display();
    }
}
