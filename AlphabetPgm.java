public class AlphabetPgm {
    public static void main(String[] args) {
    char  ch = 'V';
    if (ch >= 65 && ch <= 90) //ASCII code for A to Z ranges from 65 to 99
        System.out.println("UPPERCASE ALPHABETS");
    else if (ch>=97 && ch <=122) //ASCII code for a to z ranges from 97 to 122
        System.out.println("LOWERCASE ALPHABETS");
    else
        System.out.println("not an alphabet");

    }
}
