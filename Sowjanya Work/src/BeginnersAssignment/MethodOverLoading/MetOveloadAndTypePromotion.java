package BeginnersAssignment.MethodOverLoading;

public class MetOveloadAndTypePromotion {

    //Type Promotion table:
    /*byte → short → int → long
    short → int → long
    int → long → float → double
    float → double
    long → float → double*/

    void disp(int a, double b){
        System.out.println("Method A");
    }

    void disp(int a, double b, double c){
        System.out.println("Method B");
    }

    public static void main(String args[]){
        MetOveloadAndTypePromotion obj = new MetOveloadAndTypePromotion();
        /* I am passing float value as a second argument but
         * it got promoted to the type double, because there
         * wasn't any method having arg list as (int, float)
         */
        obj.disp(100, 20.67f);//float value got promoted to double value
        obj.disp(10,234.78f,675.45f);//float value got promoted to double value
    }
}
