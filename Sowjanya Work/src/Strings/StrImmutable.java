package Strings;

public class StrImmutable {
    public static void main(String[] args) {

        String s = new String("java");

        s.concat("language");

        System.out.println(s);
        //once we create string obj we are not allowed to perform any changes in that obj.
        //If we are trying to perform any changes with those changes a new obj will be created.
        // This non-changeable behaviour is known as immutability
    }
}
