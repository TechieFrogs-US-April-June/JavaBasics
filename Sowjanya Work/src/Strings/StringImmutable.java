package Strings;

public class StringImmutable {
    public static void main(String[] args) {

        String s = new String("Sowji");
        //String is Immutable. we cant do any changes in the existing object
        //If we try to do any changes with those changes a new object will be created
        // This non changeable behaviour is Immutability concept
        s.concat("Talasila");
        System.out.println(s);

        StringBuffer sb = new StringBuffer("Sowji");
        //Once StringBuffer object is created we can do any changes in that object
        sb.append("Talasila");
        System.out.println(sb);

    }



}
