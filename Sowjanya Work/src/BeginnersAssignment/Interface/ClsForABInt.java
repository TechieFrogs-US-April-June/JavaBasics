package BeginnersAssignment.Interface;

public class ClsForABInt implements AInt,BInt{

    public static void main(String[] args) {
        /* reference to x is ambiguous both variables are x
         * so we are using interface name to resolve the
         * variable
         */
        //System.out.println(x);
        System.out.println(AInt.x);
        System.out.println(BInt.x);
    }

}
