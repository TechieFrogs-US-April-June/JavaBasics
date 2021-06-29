public class ForLoopPatternPgm22 {
    public static void main(String[] args) {

        //pyramid pattern
       /* for(int i=1;i<=5;i++){
           for(int j=5;j>i;j--){
               System.out.print(" ");
           }
           for(int j=1;j<=i;j++){
               System.out.print("* ");
           }
           System.out.println(" ");
       }
        //Inverted pyramid
        for(int i=1;i<=5;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=5;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println(" ");
        }*/
        //printing pyramid
        int rows=5;
       for(int i=rows;i>=1;i--){
            for(int j=1;j<rows-1;j++){
                System.out.print(" ");
            }
            for(int j=5;j>=i;j--){
                System.out.print("* ");
            }

            System.out.println(" ");
        }
        //printing Floyd Triangle
      /*  for(int i=1,k=1;i<=4;i++) {
            for (int j = 1; j<=i ;j++,k++) {
                System.out.print(k+" ");
            }
            System.out.println(" ");
        }*/
    }
}
