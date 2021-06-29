package Strings;

public class StringTrimMethod {
    public static void main(String[] args) {
        String s1 = " hdfygfbdu ykgjfgvjhx  ";
        // trims the spaces at begin of the string and end of the string.will not trim the space in between
        System.out.println(s1.trim());

        String str = " "; // Not an empty string. This is space character string.Length of string is one
        str.trim();
        System.out.println(str.equals("")+ " " +str.isEmpty());

        String st = "Java Programming Language";
        int len = st.trim().length();
        System.out.println(len);


    }
}
