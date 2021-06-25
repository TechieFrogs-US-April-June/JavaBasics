package SirishaWork.src.JavaControlStatements;

public class SwitchCaseWithCharacter {
    public static void main(String args[]){
        char ch='y';
        switch(ch)
        {
            case 'd':
                System.out.println("Case 1 ");
                break;
            case 'b':
                System.out.println("Case 2 ");
                break;
            case 'x':
                System.out.println("Case 3 ");
                break;
            case 'y':
                System.out.println("Case 4 ");
                break;
            default:
                System.out.println("Default ");
        }
    }
}
