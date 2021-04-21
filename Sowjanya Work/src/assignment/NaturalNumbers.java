package assignment;

public class NaturalNumbers {
    public static void main(String[] args){
        //Sum using for loop
       /* int a = 20;
        int sum = 0;
        for(int i=1; i<=a; i++){
            sum += i;//sum = sum+1

        }
        System.out.println("Result = " +sum);

        */
        //Sum using while loop
        int a =20;
        int sum = 0;
        int i = 1;
        while(i<=a){
            sum += i;
            i++;
        }
        System.out.println("Result = " +sum);
    }
}
