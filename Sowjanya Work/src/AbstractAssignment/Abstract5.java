package AbstractAssignment;

abstract class Animals {

    public abstract void cats();
    public abstract void dogs();
}

class Cats extends Animals {

    public void cats() {
        System.out.println("Cats meow");
    }
    public void dogs() {
    }
}

class Dogs extends Animals {

    public void dogs() {
        System.out.println("Dogs bark");
    }
    public void cats() {
    }
}

public class Abstract5 {
    public static void main(String[] args) {
        Cats catObj = new Cats();
        catObj.cats();

        Dogs dogObj = new Dogs();
        dogObj.dogs();


    }

}
