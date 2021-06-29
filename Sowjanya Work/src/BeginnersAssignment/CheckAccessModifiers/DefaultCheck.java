package BeginnersAssignment.CheckAccessModifiers;

/* We are importing the BeginnersAssignment.AccessModifiers.DefaultAccess package
 * but still we will get error because the
 * class we are trying to use has default access
 * modifier.
 */
import BeginnersAssignment.AccessModifiers.DefaultAccess;

public class DefaultCheck {

    public static void main(String[] args) {
        DefaultAccess obj = new DefaultAccess();

        /* It will throw error because we are trying to access
         * the default method in another package
         */
       // obj.addTwoNumbers(10, 21);
    }
}
