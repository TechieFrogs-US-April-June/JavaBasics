package assignment;

public class HalfPyramidNumbers {
    public static void main(String[] args){
        //Half Pyramid using numbers
        /*for(int i=1;i<=5;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" " );

            }
            System.out.println();
        }

         */
        //Inverted Half Pyramid using numbers
        for(int i = 5; i >= 0; i--){
            for(int j = 1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
