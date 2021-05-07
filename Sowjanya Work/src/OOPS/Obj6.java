package OOPS;

public class Obj6 {
    int i =1;
    void function1(){
        i = i+1;
        System.out.println(i);
        System.out.println("End of fun1()");
    }

    public static void main(String[] args) {
        Obj6 O1 = new Obj6();
        int x1 = 10;
        O1.i = 25;
        O1 = new Obj6();
        System.out.println(O1.i);
        O1.i = 16;
        Obj6 O2 = O1;
        System.out.println(O2.i);

    }
}
