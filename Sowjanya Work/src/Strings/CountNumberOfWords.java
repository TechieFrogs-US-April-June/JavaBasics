package Strings;

public class CountNumberOfWords {
    public static void main(String[] args) {
        String s = "jhsfh  a  jiw  dkysh kjcn hgdfd hjfh bhfjgmb hdghdbmn cmzjhyjm";

        String[] words = s.split("\\s+");

        System.out.println(words.length);

        int count = 0;
        for (int i = 0; i < s.length(); i++) {

            if (Character.isWhitespace(s.charAt(i))) {
                count++;
            }
        }
        System.out.println(count+1);

    }
}
