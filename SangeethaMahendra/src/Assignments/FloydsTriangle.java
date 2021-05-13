package src.Assignments;
// not yet finished
public class FloydsTriangle {
    public static void main(String[] args) {
        //Rows
        for (int i = 1; i <= 5; i++) { 

            //Spaces
            for (int j = 1; j <= i; j++) {
                System.out.print("");
            }
               // Printing numbers
              for(int k=1; k<=i; k++){
                System.out.print(""+ k);
               
            }
            System.out.println();
        }
    }
    
}
