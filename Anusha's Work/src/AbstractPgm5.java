abstract class Animals{
    abstract void cats();
    abstract void dogs();
}
class Cat extends Animals{
    void cats(){
        System.out.println("Cats meow");
    }
    void dogs(){}
}
class Dog extends Animals{
    void cats(){}
    void dogs(){
        System.out.println("Dog Bark");
    }
}
public class AbstractPgm5  {
    public static void main(String[] args) {
        Cat catObj=new Cat();
        catObj.cats();
        Dog dogObj=new Dog();
        dogObj.dogs();
    }
}
