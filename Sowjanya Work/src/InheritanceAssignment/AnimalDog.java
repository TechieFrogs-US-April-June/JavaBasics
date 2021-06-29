package InheritanceAssignment;

class Animal {
    public void animalSound() {
        System.out.println("Default Sound");
    }
}

class Dog extends Animal {
    @Override
    public void animalSound() {
        System.out.println("Woof");
    }
}

public class AnimalDog {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.animalSound();
    }
}
