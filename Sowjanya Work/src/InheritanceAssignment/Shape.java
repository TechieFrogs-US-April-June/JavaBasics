package InheritanceAssignment;

public class Shape {
    void print() {
        System.out.println("This is Shape");
    }

}

class Rectangle1 extends Shape {
    void print() {
        super.print();
        System.out.println("This is rectangular shape");
    }

}

class Circle extends Shape {
    void print() {
        System.out.println("This is circular shape");
    }

}

class Square1 extends Rectangle1 {
    void print() {
        System.out.println("Square is a rectangle1");
        super.print();
    }

    public static void main(String[] args) {
        Square1 squareObj = new Square1();
        squareObj.print();
    }
}



