package BeginnersAssignment.AbstractVsInterface;

public class ProAndPublicMthd2 extends ProAndPublicAbsMthd1{

    protected void display1() { //here we can give public access modifier also instead of protected
        System.out.println("display1 method");
    }

    public void display2(){
        System.out.println("display2 method");
    }

    public void display3(){
        System.out.println("display3 method");
    }

    public static void main(String[] args) {
        ProAndPublicMthd2 obj = new ProAndPublicMthd2();
        obj.display1();
    }
}
