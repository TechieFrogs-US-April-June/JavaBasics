package BeginnersAssignment.Abstract;

public class ChildDog extends ParentAnimal{

    public void sound(){
        System.out.println("Woof");
    }
    public static void main(String args[]){
        ParentAnimal obj = new ChildDog();
        obj.sound();
    }
}
