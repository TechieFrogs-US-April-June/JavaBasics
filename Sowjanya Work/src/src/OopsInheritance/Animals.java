package OopsInheritance;

class Animal {
    private String name;

    Animal() {}
    Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
class Mammal extends Animal {
    private String name;
    Mammal() {}
    Mammal(String name) {
        this.name = name;
    }
    void greets() {
        System.out.println("hfyhfjhf");
    }
    void greets(int size, long speed) {
        System.out.println("big animal");
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "name='" + name + '\'' +
                '}';
    }
}
class Cat extends Mammal {
    private String name;

    Cat(String name) {
        this.name = name;
    }

    void greets() {
        System.out.println("Meow");
    }
}
class Dog1 extends Mammal {
    private String name;

    Dog1(String name) {
        this.name = name;
    }

    void greets() {
        System.out.println("Woof");
    }
    void greets(Dog1 another) {
        System.out.println("Woooof");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class Animals {

    public static void main(String[] args) {
        Cat catObj = new Cat("black cat");
        catObj.greets();
        Dog1 dObj = new Dog1("doggy");
        dObj.greets();
        Dog1 dObj1 = new Dog1("rocky");
        dObj1.greets(dObj1);
        catObj.greets(10,100);
        System.out.println(catObj);
        System.out.println(dObj);
    }
}
