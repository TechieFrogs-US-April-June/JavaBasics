package Strings;

public class StrgDemo {

    public static void main(String[] args) {

        String s1 = "six";

        String s2 = new String("seven");

        char c[] = {'a', 'e', 'i', 'o', 'u'};

        String s3 = new String(c);

        byte b[] = {65, 66, 67};

        String s4 = new String(b);

        System.out.println(s1+ "\n" +s2 + "\n" +s3 + "\n" + s4);


    }
}
