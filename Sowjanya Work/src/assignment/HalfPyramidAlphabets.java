package assignment;

public class HalfPyramidAlphabets {
    public static void main(String[] args) {
        for (char ch = 'A'; ch <= 'E'; ch++) {
            for(char sh = 'A'; sh <= ch ; sh++) {
                System.out.print(ch+ " ");
            }

            System.out.println();
        }



    }
}
