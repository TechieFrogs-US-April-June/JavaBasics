package OOPS;

public class TestOuter2 {
    static  int data = 10;

    static class Inner {
       //void msg(){ //For this method we need to create an instance for static nested cls
        static void msg() { //If static keyword is mentioned before void then no need to create instance of static nested cls
            System.out.println("Data: " +data);
        }
    }

    public static void main(String[] args) {
        //TestOuter2.Inner object = new TestOuter2.Inner();
       TestOuter2.Inner.msg(); //no need to create the instance of static nested class
        //object.msg();
    }



}
