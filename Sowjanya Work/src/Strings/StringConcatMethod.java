package Strings;

public class StringConcatMethod {
    public static void main(String[] args) {

        String s = "java";

        s = s.concat("language");//using concat method

        System.out.println(s);

        s = s + "software"; //using + operator also we can concat two strings
        System.out.println(s);

        s += "software";
        System.out.println(s);
    }
}
