package Strings;

public class StringParanthesis {

    public static void main(String[] args) {
        String s = "Hello (World!!)))()())())))((((";
        char[] ch = s.toCharArray();
        int open=0;
        int close=0;

        for(int i=0; i<s.length(); i++) {
            if(ch[i] == 40) {
                open++;
            }
            if(ch[i] == 41) {
                close++;
            }
        }

        if(open == close) {
            System.out.println("String has valid opening and closing parenthesis");
        } else {
            if(open>close) {
                System.out.println("Have extra "+(open-close) + " open paranthesis");
            } else {
                System.out.println("Have extra "+(close-open) + " close paranthesis");
            }
        }
    }
}
