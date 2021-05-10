package src.Assignments;

public class LeapYearIfElse 
{
      public static void main (String[] args) 
      {  
    //  A year is leap, if divisible by 4 and 400. but, not by 100
    int leapYear = 2000;
    //if (leapYear % 4 == 0 && leapYear % 400 == 0 || leapYear % 100 != 0)
   // if ((leapYear % 4 == 0 && leapYear % 400 == 0) || leapYear % 100 != 0)
    if ((leapYear % 4 == 0 && leapYear % 100 != 0) || leapYear % 400 == 0)
    {
       System.out.println("Leap Year");
    } else 
    {
        System.out.println("Common Year");
    }





      }         
}