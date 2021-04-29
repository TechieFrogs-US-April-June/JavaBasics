package SirishaWork.src.java.practice;

public class Object1 {
    //instance variable(Fields)
    int a= 5;
    int b = 10;
    //Method
    void display(){
        System.out.println("values of a and b "+ a +" " +b);
    }
    public static void main(String[] args) {
        Object1 testobj = new Object1();
        testobj.display();
        testobj.a =10;
        testobj.b =20;
        testobj.display();

    }
}
