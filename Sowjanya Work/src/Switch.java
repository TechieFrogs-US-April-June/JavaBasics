public class Switch {
    public static void main(String args[]){
        //Found Alphabets A to E otherwise default not found
        /*char charvalue = 'A';
        switch (charvalue){
            case 'A':
                System.out.println("A is found");
                break;
            case 'B':
                System.out.println("B is found");
                break;
            case 'C':
                System.out.println("C is found");
                break;
                case 'D':
                    System.out.println("D is found");
                    break;
                    case 'E':
                        System.out.println("E is found");
                        break;
            default:
                System.out.println("not found");
                break;
        }



        //Day of the week using Switch
        int day = 7;
        switch (day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Invalid day");
                break;
        }

         */
        //Day of the week using If then else
        int day = 5;
        if(day == 0)
            System.out.println("Sunday");
        else if(day == 1)
            System.out.println("Monday");
        else if(day == 2)
            System.out.println("Tuesday");
        else if(day == 3)
            System.out.println("Wednesday");
        else if(day == 4)
            System.out.println("Thursday");
        else if (day == 5)
            System.out.println("Friday");
        else if(day == 6)
            System.out.println("Saturday");
        else
            System.out.println("Invalid day");

    }
}
