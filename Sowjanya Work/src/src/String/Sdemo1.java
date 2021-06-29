package String;

public class Sdemo1 {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = new String("xyz");
        String s3 = new String("xyz");

        if(s2 == s3)
            System.out.println("s2 & s3 are equal");
        else
            System.out.println("s2 & s3 are not equal");

        String s4 = "abc";
        if(s1 == s4)
            System.out.println("s1 & s4 are equal");
        else
            System.out.println("s1 & s4 are not equal");

    }
}
