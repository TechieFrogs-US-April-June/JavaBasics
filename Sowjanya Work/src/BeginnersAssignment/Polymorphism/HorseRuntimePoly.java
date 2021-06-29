package BeginnersAssignment.Polymorphism;

public class HorseRuntimePoly extends AnimalRuntimePoly {

    @Override
    public void sound(){
        System.out.println("Neigh");
    }
    public static void main(String args[]){
        AnimalRuntimePoly obj = new HorseRuntimePoly();
        obj.sound();
    }
}
