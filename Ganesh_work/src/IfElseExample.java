public class IfElseExample {
    public static void main(String[] args) {
        //defining a variable
        /*int number=13;
        //Check if the number is divisible by 2 or not
        if(number%2==0) {
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }

         */

        int year = 2020;
        if((year % 4 == 0 && year % 100 != 0) || (year % 4 ==0)){
            System.out.println("LEAP YEAR");
        }else{
            System.out.println("COMMON YEAR");
        }


    }
}
