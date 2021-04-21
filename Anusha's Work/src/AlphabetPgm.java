

public class AlphabetPgm {
    public static void main(String[] args) {
        char ch='!';
        if (ch >= 'A'  && ch <= 'Z') //ASCII code for A to Z ranges from 65 to 90
            System.out.println("UPPERCASE Alphabet");
        else if (ch>='a' && ch <='z')//ASCII code for a to z ranges from 97 to 122
            System.out.println("LOWERCASE Alphabet");
        else
            System.out.println("Not an Alphabet");
        /*
        switch (ch) {
            case 'a' : System.out.println("given Character is an Alphabet");
                        break;
            case 'b' : System.out.println("given Character is an Alphabet");
                        break;
            case 'C' : System.out.println("given Character is an Alphabet");
                        break;
            case 'd' : System.out.println("given Character is an Alphabet");
                        break;
            case 'e' : System.out.println("given Character is an Alphabet");
                        break;
            case 'f' : System.out.println("given Character is an Alphabet");
                        break;
            case 'g' : System.out.println("given Character is an Alphabet");
                        break;
            case 'h' : System.out.println("given Character is an Alphabet");
                        break;
            case 'i' : System.out.println("given Character is an Alphabet");
                        break;
            case 'j' : System.out.println("given Character is an Alphabet");
                        break;
            case 'k' : System.out.println("given Character is an Alphabet");
                        break;
            case 'l' : System.out.println("given Character is an Alphabet");
                        break;
            case 'm' : System.out.println("given Character is an Alphabet");
                        break;
            case 'n' : System.out.println("given Character is an Alphabet");
                        break;
            case 'o' : System.out.println("given Character is an Alphabet");
                        break;
            case 'p' : System.out.println("given Character is an Alphabet");
                        break;
            case 'q' : System.out.println("given Character is an Alphabet");
                        break;
            case 'r' : System.out.println("given Character is an Alphabet");
                        break;
            case 's' : System.out.println("given Character is an Alphabet");
                        break;
            case 't' : System.out.println("given Character is an Alphabet");
                        break;
            case 'u' : System.out.println("given Character is an Alphabet");
                        break;
            case 'v' : System.out.println("given Character is an Alphabet");
                        break;
            case 'w' : System.out.println("given Character is an Alphabet");
                        break;
            case 'x' : System.out.println("given Character is an Alphabet");
                        break;
            case 'y' : System.out.println("given Character is an Alphabet");
                        break;
            case 'z' : System.out.println("given Character is an Alphabet");
                        break;
            default  :System.out.println("given Character is not  an Alphabet");
                        break;
        }
        */
    }
}
