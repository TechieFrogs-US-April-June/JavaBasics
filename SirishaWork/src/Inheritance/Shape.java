package SirishaWork.src.Inheritance;

public class Shape {
     void print(){
        System.out.println("This is shape");
    }
}

//Rectangle is a subclass of shape class
class Rectangle1 extends Shape {
    void print(){
        System.out.println("This is a Rectangular shape");
    }
}

//circle is a subclass of shape class
class Circle1 extends Shape{
    void print(){
        System.out.println("This is a circular shape");
    }
}

class Square1 extends Rectangle1{
    void print(){
        super.print();
        System.out.println("Square is a Rectangle");
    }

    public static void main(String[] args) {
        Square1 squ1obj = new Square1();
        squ1obj.print();
        Rectangle1 rectobj = new Rectangle1();
        //rectobj.print();
    }
}
