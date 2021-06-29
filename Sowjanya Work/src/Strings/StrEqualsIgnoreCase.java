package Strings;

public class StrEqualsIgnoreCase {

    public static void main(String[] args) {

        String s = "SOWJI";
        System.out.println(s.equals("sowji"));//false bcoz case in not same here

        String s1 = "SOWJI";

        //true bcoz checks only content here case is ignored
        System.out.println(s.equalsIgnoreCase("sowji"));


        String st1 = "Java";
        String st2 = new String("java");

        if(st1.equalsIgnoreCase(st2)) {
            System.out.println("Equal");
        } else
            System.out.println("Not Equal");
    }

}
