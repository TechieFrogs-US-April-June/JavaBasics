public class LargestAmongThreeNumbers {
    public static void main(String[] args) {
         int a1 = 10, a2 = 23, a3 = 43;
         if (a1 >= a2 && a1 >= a3)
             System.out.println(a1 + " is largest number");
         else if (a2 >= a1 && a2 >= a3)
             System.out.println(a2 + " is largest number");
         else
             System.out.println(a3 + " is Largest Number");
    }
}
