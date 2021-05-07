package OopsInheritance;

public class Main {
    public static void main(String[] args) {
        AnimalSuper animal = new AnimalSuper("Animal",1,1,5,5);

        DogSub dog = new DogSub("Yorkie",8, 20,2, 4, 1, 20, "long silky");
        dog.eat();
        dog.walk();
        dog.run();
        dog.moveLegs(4);
        dog.move(10);

    }
}
