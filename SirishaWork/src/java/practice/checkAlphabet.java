package java.practice;

public class checkAlphabet {
    public static void main(String[] args) {
        char c = 'q';

        if ((c>='a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            System.out.println( c + " is an alphabet");
        else
            System.out.println(c + " is not an alphabet");
    }
}
