package Constructos;

public class UsingThis {
    int i;
    //first constructor
    UsingThis(int x) {
        System.out.println(i);
        this.i = x+1;
        x = x+1;
        System.out.println(x);
        //System.out.println(i);
    }
    //second constructor
    UsingThis() {
        this.i = i+20;
        System.out.println(i);
    }
    //method
     void function()
    {
        int a = 78;
        System.out.println(a);
        System.out.println(this.i);
        this.i = this.i+1;
        System.out.println(i);//If the method is defined as static we cant use non static variables here like i

    }
    //main method
    public static void main(String[] args) {
        UsingThis ut = new UsingThis(56);
        UsingThis ut1 = new UsingThis();
        ut.function();//calling function() method using parameterised constructor[so taking values from UsingThis(int x) constructor]
        ut1.function(); // calling function() method with default constructor [so taking values from UsingThis() constructor]
        System.out.println(ut.i);
        System.out.println(ut1.i);

    }
}
