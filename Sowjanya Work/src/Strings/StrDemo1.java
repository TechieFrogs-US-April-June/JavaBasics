package Strings;

public class StrDemo1 {
    public static void main(String[] args) {
        String s1 = "name";
        String s2 = "city";
        String s3 = "name";
        String s4 = new String("name");
        String s5 = new String("name");


        System.out.println("s1 hashcode: " +System.identityHashCode(s1));
        System.out.println("s2 hashcode: " +System.identityHashCode(s2));
        System.out.println("s3 hashcode: " +System.identityHashCode(s3));
        System.out.println("s4 hashcode: " +System.identityHashCode(s4));
        System.out.println("s5 hashcode: " +System.identityHashCode(s5));

        System.out.println("s1==s3: " +(s1 == s3));
        System.out.println("s2==s3: " +(s2 == s3));
        System.out.println("s2==s4: " +(s2 == s4));
        System.out.println("s3==s4: " +(s3 == s4));
        System.out.println("s4==s5: " +(s4 == s5));

        System.out.println("s1.equals(s3): " +s1.equals(s3));
        System.out.println("s1.equals(s2): " +s1.equals(s2));
        System.out.println("s2.equals(s3): " +s2.equals(s3));
        System.out.println("s2.equals(s4): " +s2.equals(s4));
        System.out.println("s1.equals(s4): " +s1.equals(s4));
        System.out.println("s4.equals(s5): " +s4.equals(s5));



    }
}
