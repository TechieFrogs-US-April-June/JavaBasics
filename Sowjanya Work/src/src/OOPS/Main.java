package OOPS;


/*class Dog1 {
    //public void bark() {
      //  System.out.println("woof");

    }
}*/
class Dog1 {
    private static String name;
    public Dog1(String name) {
        Dog1.name = name;
    }
    public void printName() {
        System.out.println("name: " +name);
    }
}

public class Main {
    public static void main(String[] args) {
       // Dog1 rex = new Dog1(); //Create instance
       // rex.bark();  // call instance method
        Dog1 rex = new Dog1("rex");
        Dog1 fluffy = new Dog1("FLuffy");
        rex.printName();
        fluffy.printName();

    }
}