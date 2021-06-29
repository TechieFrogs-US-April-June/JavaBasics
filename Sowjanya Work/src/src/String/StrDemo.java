package String;

public class StrDemo {

    public static void main(String[] args) {
        String name = "Sowjanya is my name";
        String gender = "   female    ";
        String str = new String("sahara");
        String st = new String("aanya");
        int x = 10;
        System.out.println("Length: " +name.length());
        System.out.println("character: " +name.charAt(6));
        System.out.println("substring(begin): " +name.substring(2));
        System.out.println("substring(begin & end): " +name.substring(3, 6));

        //replaces all occurences of 'a' to 'o'(need to give characters in single quotes)
        System.out.println("replace(char old char new): " +name.replace('a', 'o'));

        //replaces all occurences of "S" to "a"(need to give characters in double quotes)
        System.out.println("replace(charseq target charseq replacement: " +name.replace("S" ,"a"));

        //replaces all occurences of "j" to "h"(same as replace(charseq target charseq replacement)
        System.out.println("replace(str regex str replacement): " +name.replaceFirst("j" , "h"));

        System.out.println("trim: " +gender.trim());

        //System.out.println("split: " +name.split("j"));

        //changes all caps to small
        System.out.println("lowercase: " +name.toLowerCase());

        //changes all small to caps
        System.out.println("uppercase: " +name.toUpperCase());

        System.out.println("hashcode: " +name.hashCode());

        System.out.println(str == st);
        System.out.println(str.equals(st));
        System.out.println(str.equalsIgnoreCase(st));
        System.out.println(str.compareTo(st));
        System.out.println(str.compareToIgnoreCase(name));

    }
}
