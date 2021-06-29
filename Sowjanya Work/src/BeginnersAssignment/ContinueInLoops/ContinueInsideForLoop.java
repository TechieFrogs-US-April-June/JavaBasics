package BeginnersAssignment.ContinueInLoops;

public class ContinueInsideForLoop {
    public static void main(String[] args) {

        for (int j=0; j<=6; j++)
        {
            if (j==4)
            {
                continue;
            }

            System.out.print(j+" ");
        }
    }
}
