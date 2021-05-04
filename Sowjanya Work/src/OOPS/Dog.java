package OOPS;

public class Dog {
    String breed;
    String size;
    int age;
    String color;


    // method 1
    public String getInfo() {
        return ("Breed is: "+breed+" Size is:"+size+" Age is:"+age+" color is: "+color);
    }


    public static void main(String[] args) {
        Dog greyhound = new Dog();
        greyhound.breed="greyhound";
        greyhound.size="Medium";
        greyhound.age=5;
        greyhound.color="white";
        System.out.println(greyhound.getInfo());
    }
}
