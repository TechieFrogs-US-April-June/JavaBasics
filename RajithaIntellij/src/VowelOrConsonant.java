package FirstProject.src;

public class VowelOrConsonant {
    public static void main(String[] args){
        char ch='J';
        switch(ch){//checking the given character with the cases
            //no need of break for aeiou
            case'a':System.out.println("a is vowel");
            break;
            case'e':System.out.println("e is vowel");
            break;
            case'i':System.out.println("i is vowel");
            break;
            case'o':System.out.println("o is vowel");
            break;
            case'u':System.out.println("u is vowel");
            break;
            case'A':System.out.println("A is vowel");
            break;
            case'E':System.out.println("E is vowel");
            break;
            case'I':System.out.println("I is vowel");
            break;
            case'O':System.out.println("O is vowel");
            break;
            case'U':System.out.println("U is vowel");
            break;
            default:System.out.println("Given character is consonant");

        }
        /* switch (ch) {
            case'A':
            case'E':
            case'I':
            case'O':
            case'U':
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }*/
        /* char ch='e';
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant") */
    }
    
}
