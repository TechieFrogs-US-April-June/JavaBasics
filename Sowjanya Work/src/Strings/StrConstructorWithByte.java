package Strings;

public class StrConstructorWithByte {

    public static void main(String[] args) {

        byte[] b = {97,98,99,100}; // converting byte values into characters

        String s = new String(b);

        System.out.println("s = " +s); // s = abcd
    }
}
