package OopsAbstraction;

abstract class Shape {
    abstract void draw();

    void method() {
        System.out.println("Shape method");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}
public class TestAbstraction {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
        s.method();
        Shape s1 = new Rectangle();
        s1.draw();
        s1.method();

    }
}
