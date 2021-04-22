public class LargestNumber {
    public static void main(String[] args) {
        int x = 30;
        int y = 40;
        int z = 50;
        if (x > y && y > z) {

            System.out.println("Largest number is x");
        } else {
            if (x > z && y > z) {
                ;
                System.out.println("Largest number is y ");
            } else {
                System.out.println("Largest number is z");
            }
        }
    }
}