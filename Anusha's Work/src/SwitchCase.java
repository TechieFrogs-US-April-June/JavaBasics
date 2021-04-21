public class SwitchCase {
    public static void main(String[] args) {
        char ch='a';
        switch(ch) {
            case 'a':
                System.out.println("vowel 1");
                break;
            case 'e':
                System.out.println("vowel 2");
                break;
            case 'i':
                System.out.println("vowel 3");
                break;
            case 'o':
                System.out.println("vowel 4");
                break;
            case 'u':
                System.out.println("vowel 5");
                break;
            default:
                System.out.println("Not a vowel");
                break;
        }
    }
}
