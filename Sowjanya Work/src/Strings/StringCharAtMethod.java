package Strings;

public class StringCharAtMethod {

    public static void main(String[] args) {

        String s = "sowji";

        //The charAt() method returns a single character of specified index.
        System.out.println(s.charAt(3));

        //System.out.println(s.charAt(30)); // RE(StringIndexOutOfBoundsException)


        //To get all characters, we can use loop.
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            System.out.println(c);
        }

        //to convert String to char in java using toCharArray() method.
        //The toCharArray() method of String class converts this string into character array.

        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            System.out.println(ch[i]);
        }
    }
}
