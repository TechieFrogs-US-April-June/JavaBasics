package src.InheritanceExercises.AandB;

public class A {

    int i;
    int j;

    void show() { // Method
        System.out.println("Display the Value of i : " + i);
        System.out.println("Display the Value of j : " + j);
    }

    public A(int i, int j) { // Constructor
        this.i = i;
        this.j = j;
    }

    public static void main(String[] args) {
        A  aObj = new A(6 , 9);
        aObj.show();

    }

}
