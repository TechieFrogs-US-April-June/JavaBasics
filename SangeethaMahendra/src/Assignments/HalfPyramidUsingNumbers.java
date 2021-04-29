public class HalfPyramidUsingNumbers {
    public static void main(String[] args) {
        
    //HALF PYRAMID PATTERN USING NUMBERS
    for(int i=1; i<=5; i++)
    {
        for(int j=1; j<=i; j++)
        {
            System.out.print(" " + j);
        }
        System.out.println(" ");
    }

   //INVERTED HALF PYRAMID PATTERN USING NUMBERS

    System.out.println("\n");
    for(int n=5; n>=1; n--)
    {
        for(int j=1; j<=n; j++)
        {
            System.out.print(" " + j);
        }
        System.out.println(" ");
    }
}
}

