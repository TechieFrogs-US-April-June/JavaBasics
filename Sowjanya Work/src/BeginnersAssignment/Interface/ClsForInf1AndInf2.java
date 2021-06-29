package BeginnersAssignment.Interface;

public class ClsForInf1AndInf2 implements Inf2{

    /* Even though this class is only implementing the
     * interface Inf2, it has to implement all the methods
     * of Inf1 as well because the interface Inf2 extends Inf1
     */
    public void method1(){
        System.out.println("method1");
    }
    public void method2(){
        System.out.println("method2");
    }

    public static void main(String[] args) {

        Inf2 obj = new ClsForInf1AndInf2();
        obj.method1();
        obj.method2();
    }
}