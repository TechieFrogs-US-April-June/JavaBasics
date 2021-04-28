package OOPS;

class Oc {
   static int x = 20;
    int y = 30;
    private int z = 50;
    private static int s = 100;


    class Ic {
        void display() {
            System.out.println("x= " +x);
            System.out.println("y= " +y);
            System.out.println("z= " +z);
            System.out.println("s= " +s);
        }
    }
}

public class PrivateCls {
    public static void main(String[] args) {
        Oc outerObject = new Oc();
        Oc.Ic innerObject = outerObject.new Ic();
        innerObject.display();

        }
}
