class X{
    static void print(){
        System.out.println("Parent");
    }
    void print1(){
        System.out.println("Non static method can be accessed with parent class referring to the child class ");
    }
}
class Y extends  X{
    static void print(){
        System.out.println("Child");
    }

}
public class MethodPgm8 {
    public static void main(String[] args) {
        X.print();
        Y.print();
        X xyObj=new Y();
        xyObj.print1();


    }
}
