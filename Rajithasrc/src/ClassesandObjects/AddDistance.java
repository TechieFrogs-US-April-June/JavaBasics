package ClassesandObjects;

import java.util.*;

class Distance

{

int feet , inches;

void getdistance() {

Scanner in = new Scanner(System.in);

System.out.print("Enter feet: ");

feet = in.nextInt();

System.out.print("Enter inches: ");

inches = in.nextInt();

}

     void addDistanceMethod(Distance d1, Distance d2)

{

int sumofFeet = d1.feet + d2.feet;

int sumofInch = d1.inches + d2.inches;

System.out.println(sumofFeet + "feet"+"'" + sumofInch+"inches");

}
//in.close();

}


class AddDistance {
    
    public static void main (String[] args)

{

   Distance d1 = new Distance();

   Distance d2 = new Distance();

//Distance d3 = new Distance();

System.out.println("Enter first distance ");

d1.getdistance();

System.out.println("Enter second distance ");

d2.getdistance();
 d1.addDistanceMethod(d1,d2);
 
 //d3.addDistance(d1,d2);
 
} 

}
