package OOPS;

class Outerclass{
    static int x = 10;//static member
    int y = 20;// instance(non-static) member
    private int z = 30;// private member

    class InnerClass{ //Inner Class
        void display(){
            System.out.println("x= " +x); // can access static member of outer class
            System.out.println("y= " +y); // can also access non-static member of outer class
            System.out.println("z= " +z); // can also access a private member of the outer class
        }
    }

}

public class InnerClsDemo {  // Driver class

    public static void main(String[] args) {  //Main method
        Outerclass outerObject = new Outerclass();  // accessing an inner class
        Outerclass.InnerClass innerObject = outerObject.new InnerClass();
        innerObject.display();


    }
}
