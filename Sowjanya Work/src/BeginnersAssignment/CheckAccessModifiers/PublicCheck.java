package BeginnersAssignment.CheckAccessModifiers;

import BeginnersAssignment.AccessModifiers.PublicAccess;

public class PublicCheck {

    public static void main(String[] args) {

        //The members, methods and classes that are declared public can be accessed from anywhere.
        // (Same Cls,Subcls,Same Package, Other Package,other cls,subcls)
        PublicAccess obj = new PublicAccess();

        System.out.println(obj.addTwoNumbers(10,20));
    }
}
