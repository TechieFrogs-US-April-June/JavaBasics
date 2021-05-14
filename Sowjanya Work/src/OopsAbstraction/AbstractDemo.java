package OopsAbstraction;

abstract class Animal {
    //Regular method
    public void sleep() {
        System.out.println("Animal is sleeping");
    }
    //abstract method (does not have body of method)
    public abstract void animalSound();

    Animal() {
        System.out.println("Animal constructor");
    }
}
//subclass (inherit from Animal)
class Cow extends Animal {

    Cow() {
        System.out.println("Cow constructor");

    }

    public void animalSound() {
        //body of animalSound() is provided here
        System.out.println("The cow says: moo moo");
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
        Cow cowObj = new Cow();
        cowObj.animalSound();
        cowObj.sleep();
    }
}
