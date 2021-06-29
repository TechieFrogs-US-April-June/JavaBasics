package BeginnersAssignment.Variables;

public class AsciiCodeOfChar {

    public static void main(String[] args) {

        char ch = 'P';
        int asciiCode = ch;

        // type casting char as int
        int asciiValue = (int)ch;

        System.out.println("ASCII value of "+ch+" is: " + asciiCode);
        System.out.println("ASCII value of "+ch+" is: " + asciiValue);
    }
}
