package src.Objects;

public class ObjectsExample {

    // EXAMPLE ; CAN CREATE N NUMBER OF OBJECT
    int a = 5; // initializing instance variable
    int b = 10;
    static int i; // static variable
    void display()  // Method
    {
        System.out.println("Values of a and b "+ a + " "+ b);
    }
    public static void main(String[] args) {
         //craeting object for the initialized instance variable
         //  1           2     3       4
        ObjectsExample objEg = new ObjectsExample(); // 1 = Class; 2 = object reference with a new keyword; 3 = new keyword , allocates memory; 4 = constructor; Constructor must be same name as class name
        objEg.display();
        objEg.a = 10;
        objEg.b = 20;
        objEg.display();

        ObjectsExample objEg2 = new ObjectsExample(); 
        objEg2.a =100;
        objEg2.b = 200;
        objEg2.display();
        objEg.display(); // updated the value to 10 and 20; the output for this is 10 and 20

        System.out.println(i); // No need to create object for static variable

        System.out.println(ObjectsExample.i); //proper way of use it

    }
    
}
