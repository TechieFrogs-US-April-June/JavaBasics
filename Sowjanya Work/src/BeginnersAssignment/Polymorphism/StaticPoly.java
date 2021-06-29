package BeginnersAssignment.Polymorphism;

public class StaticPoly {
    /*Method overloading is one of the way java supports static polymorphism
      This is also known as compile time polymorphism
     */

    int add(int a, int b)
    {
        return a+b;
    }
    int  add(int a, int b, int c)
    {
        return a+b+c;
    }

    public static void main(String[] args) {

        StaticPoly obj = new StaticPoly();
        System.out.println(obj.add(10, 20));
        System.out.println(obj.add(10, 20, 30));
    }
}
