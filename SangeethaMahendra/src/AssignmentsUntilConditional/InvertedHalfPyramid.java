public class InvertedHalfPyramid {
    public static void main(String[] args) {

        //INVERTED HALF PYRAMID *
        for(int i=5; i>=1; i--) //5>=1; yes; ,5>=2; yes
        {
            for(int j=1; j<=i; j++)// 2<=5 no; 2=2 yes; print *;
            {
                System.out.print("* ");
            }
            System.out.println("");
        }

        //INVERTED HALF PYRAMID PATTERN USING NUMBERS
        for(int i=5; i>=1; i--)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(" " + j);
            }
            System.out.println(" ");
        }
    }
    
}
