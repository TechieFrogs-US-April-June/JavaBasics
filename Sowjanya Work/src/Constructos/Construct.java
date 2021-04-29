package Constructos;

public class Construct {
    int a , b;

    Construct(int i) {
        a = i;
        System.out.println("Inside");
        System.out.println(a);
    }
    Construct(int i, int j) {
        a = i;
        b = j;
        System.out.println("Inside");
        System.out.println(a+  " " +b);
    }
    //Construct() {
        //System.out.println(a+ " " +b);
   // }

    public static void main(String[] args) {
        Construct obj1 = new Construct(6);
        //Construct obj2 = new Construct(); //Here we get compilation error
        Construct obj3 = new Construct(10,20);
        System.out.println(obj1.a);
        System.out.println(obj3.b+ " " +obj3.a);

    }
}
