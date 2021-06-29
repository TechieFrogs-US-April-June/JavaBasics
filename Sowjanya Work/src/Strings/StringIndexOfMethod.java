package Strings;

public class StringIndexOfMethod {
    public static void main(String[] args) {
        String s = "Hello World";
        s.trim();// trim() will remove spaces present at beginning  and end of string

        //Indexof is goingto return first occurrence of the specified character.
        // If the specified character is not available then we will get -1.
        int i1 = s.indexOf(" ");
        int c = s.indexOf("l");
        int m = s.indexOf('i');

        System.out.println(i1);
        System.out.println(c);
        System.out.println(m);
    }
}
