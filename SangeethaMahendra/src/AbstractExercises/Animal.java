package src.AbstractExercises;

public abstract class Animal {

    abstract void cats();

    abstract void dogs();
}

class Cats extends Animal{
    void cats(){
        System.out.println("Cats meow");
    }
     void dogs(){}
}
class Dogs extends Animal{

    void dogs(){
        System.out.println("Dogs bark");
    }
    void cats(){}
}

class Print{

public static void main(String[] args) {
      Cats cObj = new Cats();
      cObj.cats();

      Dogs dObj = new Dogs();
      dObj.dogs();
}
}
