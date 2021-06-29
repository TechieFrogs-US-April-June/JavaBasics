package StringsAssignment;

public class NoOfCharacters22 {
    public static void main(String[] args) {
        String s = "gfkjyfgsjfyhfh gkfyjghdfluigyluoijk vudfhafyaefj fgvoijhfiauy fajkufioalkjfl";

        int totalCount = s.length();

        System.out.println("String Length(): " +totalCount);
        System.out.println("String Length() without spaces: " +s.replace(" ", "").length());
    }
}
