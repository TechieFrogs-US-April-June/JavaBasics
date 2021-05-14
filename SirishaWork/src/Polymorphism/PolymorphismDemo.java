package SirishaWork.src.Polymorphism;

public class PolymorphismDemo {

    void add(){
        System.out.println("In add no parameters");
    }
    long add(long a, int b){
        System.out.println("In add with 2 values "+(a+b));
        return a+b;
    }
    void add(int a, int b){
        System.out.println("In add with 2 diff params "+(a+b));
    }
    void add(int b, String a){
        System.out.println( "In add with order changed params "+(a+b));
    }
    void add(int a, int b, int c) {
        c = a+b;
        System.out.println("In add with 3 params "+c);
    }
    int x = 30;
    int y = 50;
    long z = 0;
    public static void main(String[] args) {
        PolymorphismDemo polyobj = new PolymorphismDemo();
        //polyobj.z = polyobj.x + polyobj.y;
        //System.out.println(polyobj.z);
       // polyobj.add();
        polyobj.add(5 , 10);
        //polyobj.add(20,30,0);
       // polyobj.add("10",20);
       // polyobj.add(10,"20");

    }
}
