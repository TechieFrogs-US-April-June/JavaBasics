package BeginnersAssignment.Polymorphism;

public class CatRuntimePoly extends AnimalRuntimePoly {

    @Override
    public void sound(){
        System.out.println("Meow");
    }
    public static void main(String args[]){
        AnimalRuntimePoly obj = new CatRuntimePoly();
        obj.sound();
    }

}
