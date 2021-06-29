package Constructos;

public class Main {
    int sum;
    private static int num;
    final static int value = 8;

    // first constructor
    Main() {
        // calling the second constructor
        this(5, 2);
    }

    // second constructor
    Main(int arg1, int arg2) {
        // add two value
        this.sum = arg1 + arg2;
        System.out.println("mhdfgbvjdyhv");
    }

     void display() {
        System.out.println("Sum is: " + sum);
         System.out.println(num);
         System.out.println(value);
    }

    void print() {
        display();
    }

    // main class
    public static void main(String[] args) {

        // call the first constructor
        Main obj = new Main();

        // call display method
        obj.display();
       // System.out.println(num+ " " +value);
        obj.print();
    }
}
