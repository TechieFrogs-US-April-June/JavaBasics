package OopsAbstraction;

abstract class Animals {
    private String name;

    public Animals(String name) {
        this.name = name;
    }

    public abstract void eat();
    public abstract void breath();

    public String getName() {
        return name;
    }
}

class Tiger extends Animals{

    Tiger(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " is eating");
    }

    @Override
    public void breath() {
        System.out.println("Tiger is breathing");

    }
}

abstract class Bird extends Animals {
    Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " is pecking");

    }

    @Override
    public void breath() {
        System.out.println("Bird is breathing");

    }
    public abstract void fly();
}

class Parrot extends Bird {
    Parrot(String name) {
        super(name);
    }

    public void fly() {
        System.out.println("Flitting from branch to branch");
    }
}

class Penguin extends Bird {
    Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Penguin is swimming");
    }
}

public class MainAbstract {
    public static void main(String[] args) {
        Tiger dObj = new Tiger("Yorkie");
        dObj.eat();
        dObj.breath();

        Parrot parrotObj = new Parrot("Aus ringneck");
        parrotObj.eat();
        parrotObj.breath();
        parrotObj.fly();

        Bird birdObj = new Parrot("Wood stock");
        birdObj.breath();
        birdObj.eat();
        birdObj.fly();

        Penguin penObj = new Penguin("Emperor");
        penObj.eat();
        penObj.breath();
        penObj.fly();




    }

}
