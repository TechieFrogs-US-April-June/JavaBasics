package BeginnersAssignment.AccessModifiers;

public class ClsToCheckPrivateAccess {

    public static void main(String[] args) {
        PrivateAccess obj = new PrivateAccess();

        /*These are declared as private in other class.
         so can't access private variables and private methods in other cls within same package aswell*/

        //System.out.println(obj.num);
        //System.out.println(obj.square(10);
    }
}
