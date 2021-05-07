import javax.swing.*;

public class JavaVariables {
     static int a1=10;
    static int b1=20;
    int a3=25;

    public static void main(String[] args) {
        final String TRAINING;
        TRAINING="JAVA";
        //Local Variables
        /*int a=10;
        int b=20;
        int c=a+b;
        System.out.println("value of c is " + c);*/

        //Static Variables
        System.out.println("value of a1 is" + a1);

        // instance Variables
        JavaVariables obj = new JavaVariables();
        System.out.println("Value of a3" +obj.a3);

        //final variable
         System.out.println("Training " + TRAINING);
         addVar();
         System.out.println(a1);
    }

    public static void addVar() {
        //int a=3,b=6;
        //int c=a+b;
        a1+=10;
        System.out.println(a1+b1);

    }
} 