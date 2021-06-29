package OOPS;

public class StaticDemo1 {
    int i;
   static int j;
    //int j;
    static void function1(){
        System.out.println(j);//Its possible
        //System.out.println(i);// can't do it here
        j = j+1;// bcoz (static int j) is static in non-static cls and can access directly in static functionalities(methods)
        //i = i+1;//In order to refer non-static members(int i) of the class from the static functionalities, we have to create object of the class
        StaticDemo1 s1 = new StaticDemo1();
        s1.i = 15;
        s1.j = 20;
        System.out.println(s1.i);
        System.out.println(s1.j);
    }

    public static void main(String[] args) {
        function1();
        function1();
        StaticDemo1 s1 = new StaticDemo1();
        s1.i = 150;
        System.out.println(s1.i);
    }
}
