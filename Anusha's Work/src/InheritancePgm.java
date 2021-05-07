
class A{
    int a=10;
    String s1="TechieFrogs";
}
class B extends A{
    int b=20;
    String s2="JAVA";
    void display()
    {
        System.out.println(s1+ " " +s2);
    }
}


public class InheritancePgm {
    public static void main(String[] args) {
        B bObj=new B();
        System.out.println(bObj.a+"   " +bObj.b);
        bObj.display();


    }
}
