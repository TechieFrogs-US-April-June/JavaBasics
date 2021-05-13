abstract class Abstract4{
    Abstract4(){
        System.out.println("This is Abstract class Constructor");
    }
    abstract void a_method();
    void b_method(){
        System.out.println("This is a Normal method of Abstract class");
    }
}
class Subclass extends Abstract4{
    void a_method(){
        System.out.println("This is Abstract Method");
    }
}

public class AbstractPgm4 extends Subclass{
    public static void main(String[] args) {
        Subclass subObj=new Subclass();
        subObj.a_method();//Abstract Method
        subObj.b_method();//Non Abstract Method

    }
}
