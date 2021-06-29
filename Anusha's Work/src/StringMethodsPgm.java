import java.util.Locale;

public class StringMethodsPgm {
    public static void main(String[] args) {
        String s6=" Today is Saturday.Saturday is a holiday";
        int a=10;
        String s1="String Methods";
        String s2="Program";
        String s=s1+s2;
        String s4="    JAVA";
        System.out.println(s);
        String s3="Strings"+"  "+"concat Method"+"  " + "Example";
        System.out.println(s3);
        System.out.println(s1.concat(s2));
        System.out.println(s.substring(1,5));//gives the output from 2nd location character to 5th character
        System.out.println(s.substring(5));//gives the output from the 6th character in the string
        //every word of a String to uppercase
        System.out.println(s2.toUpperCase());//PROGRAM
        System.out.println(s2.toLowerCase());//program
        System.out.println(s4.trim());//eliminates space from both the ends of the string
        System.out.println(s1.startsWith("s"));//false
        System.out.println(s1.endsWith("s"));//true
        System.out.println(s1.length());//gives length of the string including spaces between strings
        System.out.println(s2.charAt(6));//returns char at specified index which strts from 0
        String s5=String.valueOf(a);//converts another datatype into string
        System.out.println(s5);
        String s7=s6.replace(s6,s6.toUpperCase());//checks for the targeted string and replace it with new string
        System.out.println(s7);
        System.out.println(s1.codePointAt(3));


    }
}
