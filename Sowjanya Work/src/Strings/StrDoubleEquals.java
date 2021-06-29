package Strings;

public class StrDoubleEquals {

    public static void main(String[] args) {

        String s1 = new String("my name is sowjanya");
        String s2 = new String("my name is sowjanya");

        System.out.println("s1==s2: " +(s1 == s2)); //false bcoz not pointing to same obj(in heap)

       // System.out.println(s1.equals(s2));

        String s3 = "my name is sowjanya";
        System.out.println("s1==s3: " +(s1 == s3)); // false bcoz not pointing to same obj(one in heap & other in scp)

        String s4 = "my name is sowjanya";
        System.out.println("s3==s4: " +(s3 == s4)); // true bcoz both are pointing to same obj(in scp)
        System.out.println(s4);

        String s5 = "my name" + " is sowjanya";
        System.out.println("s4==s5: " +(s4 == s5)); // true two constants in scp at compile time only
        System.out.println(s5);

        String s6 = "my name";

        String s7 = s6 + "is sowjanya";
        System.out.println("s4==s7: " +(s4 == s7)); // false one variable and one constant creates one obj in heap at runtime

        final String s8 = "my name";
        String s9 = s8 + " is sowjanya";
        System.out.println("s4==s9: " +(s4 == s9)); // true final constant + literal in scp

    }
}
