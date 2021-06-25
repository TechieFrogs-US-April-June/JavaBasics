package SirishaWork.src.practice;

public class TestObject1 {
    //instance variable(Fields)
    int a = 5;
    int b = 10;
    static int i = 500;// the output of i = 10 because its in the class level
    //Method
    void display() {
        //System.out.println("In old class values of a and b " + a + " " + b+" "+i);
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        System.out.println(TestObject1.i); // should print the "i" along with class name
        //object creation
        //memory allocation for each object is different
        TestObject1 testobj = new TestObject1();
        testobj.display();
        testobj.a = 10;
        testobj.b = 20;
        testobj.display();
        TestObject1 testobj2 = new TestObject1();
        testobj2.a = 100;
        testobj2.b = 200;
        testobj2.display();
        testobj.display();//again 10 and 20 got displayed because its testobj.display and not testobj2.display

    }

}
