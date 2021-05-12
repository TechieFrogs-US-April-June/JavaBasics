package src.Abstraction;

public abstract class Shape {

    int color;

    abstract void drawing();

    public void fill() {
        System.out.println("Shape.....fill");

    }

    Shape() {
        System.out.println("Shape class Constructor");
    }

    // Can not create the object of interface

}
